package java_intro_guia_6;

import java.util.Scanner;

public class MO_1_2_3_4_5_6_Condicionales {

    public static void main(String[] args) {

        String nombre = "LM";
        int Nint = 5;
        double Ndecimal = 10.4;
        float Ndecimall = 5;
        String cadena = "Luisa";
        double div = (Nint / Ndecimal) + (8.5);
        boolean boo = div == Ndecimall;
        int edad = 19;

        System.out.println("Toal: " + div); // mostrar en pantalla abrev sout
        
        System.out.println("Nombre " + nombre);
        
        System.out.println(" Edad " + edad);
        
        System.out.println(cadena);
        
        System.out.println("Bsos");

        
        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        
        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero

        System.out.println("Numero Entero " + numEntero); // Se imprime el entero

        System.out.println("Ingrese un valor logico");
        boolean logico = leer.nextBoolean();
        
        System.out.println("Ingrese un numero decimal");
        double decimal = leer.nextDouble();
        
        if((numEntero < edad) && (numEntero > 0)){
            System.out.println("El numero entero ingresado " + numEntero + 
                    " es menor a la edad " + edad + " y mayor que 0");
        } else if (numEntero == edad){
            System.out.println("El numero entero " + numEntero + 
                    " es igual a la edad " + edad );
        } else {
            System.out.println("El numero entero ingresado " + numEntero + 
                    " es mayor a la edad " + edad + " o menor que 0");
        }
        
        /* MO 6
        Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        alguno de ellos es mayor a 25.
        */ 
        System.out.println("Ingrese 2 numeros enteros");
        int n = leer.nextInt();
        int nn = leer.nextInt();
        
        if ((n >= 25)|| (nn >= 25)){
            System.out.println("Alguno de los numeros inresados es mayor a 25");
        } else {
            System.out.println("Ningunode los numeros ingresados es mayor a 25");
        }
    }
}
