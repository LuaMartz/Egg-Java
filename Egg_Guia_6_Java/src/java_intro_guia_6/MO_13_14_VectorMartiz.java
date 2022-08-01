
package java_intro_guia_6;

import java.util.Scanner;

public class MO_13_14_VectorMartiz {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        // VECTOR
        int[] vector = new int[5];
        
        System.out.println("Ingrese un numero");
        int a = leer.nextInt();
        
        for (int i = 0; i < a; i++){
            vector[i] = a; //Relleno
           }
        // Mostrar vector
        for (int i = 0; i < a; i++){
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
        // MATRIZ
        
        String[][] matriz = new String [a][a];
        
        // Asignar valores
        for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                matriz[j][k] = "A";
            }
        }
        // Mostrar
         for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                System.out.print("[" + matriz[j][k]+ "]");
            }
             System.out.println("");
        }
         
        // MO 13 Y 14
        System.out.println("Ingrese cantidad de compañeors en el equipo");
        int b = leer.nextInt();
        
        String[] Equipo = new String [b];
        
        for (int l = 0; l < b; l++) {
            Equipo[l]= leer.nextLine();
        }
        for (int l = 0; l < b; l++) {
            System.out.print("[" + Equipo[l]+ "]");
        }
        System.out.println("");
    }
    
}
