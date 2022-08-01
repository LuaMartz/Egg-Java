
package java_intro_guia_6;

import java.util.Scanner;
import java.util.Arrays;

public class FU_18_19_20_Matriz {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        /* 18
        Realizar un programa que rellene un matriz de 4 x 4 de valores
        aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de 
        una matriz A se denota por B y se obtiene cambiando sus filas por 
        columnas (o viceversa).
        */
        
        int[][] matriz = new int [4][4];
        
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                int aleatorio = (int)(Math.random()*9);
                matriz[j][k] = aleatorio;
            }
        }
        System.out.println("");
        System.out.println("MATRIZ NORMAL");
        System.out.println("");
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print("[" + matriz[j][k]+ "]");
            }
             System.out.println("");
        }
        
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                matrizT[j][k] = matriz[k][j];
            }
        }
        System.out.println("");
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("");
         for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print("[" + matrizT[j][k]+ "]");
            }
             System.out.println("");
        }
        

        /* 19
        Realice un programa que compruebe si una matriz dada es anti simétrica. 
        Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
        propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
        obtiene cambiando sus filas por columnas (o viceversa).
        */
        int[][] matrizA = new int[matrizT[0].length][matriz.length];
        
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matrizT[j].length; k++) {
                matrizA[j][k] = -matrizT[j][k];
            }
        }
        System.out.println("");
        System.out.println("MATRIZ ANTISIMETRICA");
        System.out.println("");
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print("[" + matrizA[j][k]+ "]");
            }
             System.out.println("");
        }
        if (Arrays.deepEquals(matrizT, matrizA))
            System.out.println("Es una Matriz Antisimétrica");
        else
            System.out.println("No es una Matriz Antisimétrica");
        
        /* 20
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
        1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
        idénticas. Crear un programa que permita introducir un cuadrado por 
        teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos,
        es decir, están entre el 1 y el 9.
        */
        
        int length = 0, row, column;
        
        System.out.println("");
        System.out.println("CUADRO MAGICO");
        System.out.println("");

        do {
            System.out.print("Ingrese la longitud del cuadro maico (Numero impar): ");
            try {
                length = Integer.parseInt(leer.nextLine());
            } catch (Exception e) {}
        }
        while (length % 2 == 0 || length <= 1);

            leer.close();
		
            System.out.println("");

		// Lenando la matriz con los numeros adecuados
            int matrix[][] = new int[length][length];
            row = length / 2 - 1;
            column = length / 2;
            matrix[row][column] = 1;

            for (int i = 2; i <= length * length; i++){
		if (row == 0 && column == length - 1)
                    row = length - 2;
		else if (row != 0 && column != length - 1 && matrix[row - 1][column + 1] == 0) {
                    row = row - 1;
                    column = column + 1;
		} else if (row == 0 && column != length - 1) {
                    row = length - 1;
                    column = column + 1;
		} else if (column == length - 1 && row != 0) {
                    row = row - 1;
                    column = 0;
                }else if (matrix[row - 1][column + 1] != 0 && row != 1 && column != length - 1)
                    row = row - 2;
		else if (matrix[row - 1][column + 1] != 0 && row == 1 && column != length - 1)
                    row = length - 1;

		matrix[row][column] = i;
		}

		// Painting the magic square
		System.out.print("*");
		repeat('*', length * digitCount(length * length) + 3 * (length - 1) + 2);
		System.out.print("*\n");
		
		for (row = 0; row < length; row++)
		{
                    for (column = 0; column < length; column++)
                    {
			if (column == 0)
                            System.out.print("* ");
                            System.out.print(matrix[row][column]);
				
                        if (column != length - 1)
                            repeat(' ', digitCount(length * length) - digitCount(matrix[row][column]) + 3);
				
                        if (column == length - 1) {
                            repeat(' ', digitCount(length * length) - digitCount(matrix[row][column]) + 1);
                            System.out.print("*");
                            }
                    }
                    System.out.println();
			
                    if (row < length - 1) {
			System.out.print("*");
			repeat(' ', length * digitCount(length * length) + 3 * (length - 1) + 2);
                        System.out.print("*\n");
                    }
		}
		
		System.out.print("*");
		repeat('*', length * digitCount(length * length) + 3 * (length - 1) + 2);
		System.out.print("*\n");
		
		// Knowing the sum of rows, columns and diagonals
		int sum = 0;
		for(int i = 0; i < matrix.length; i++)
			sum += matrix[0][i];
			
		System.out.println("\nTodas las filas, diagonales y columnas suman:  " + sum);
    }

	public static int digitCount(int number)
	{
            int j = 0;

            for (;;) {
                number = number / 10;
		j++;
		if (number == 0)
                    break;
            }
            return (j);
	}

	public static void repeat(char c, int i)
	{
            for (int x = 0; x < i; x++)
		System.out.print(c);
	}
}

    
    

