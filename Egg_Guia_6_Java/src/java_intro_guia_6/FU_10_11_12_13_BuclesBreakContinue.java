package java_intro_guia_6;

import java.util.Scanner;

public class FU_10_11_12_13_BuclesBreakContinue {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       
       // 10
       // Escriba un programa en el cual se ingrese un valor límite positivo, 
       //y a continuación solicite números al usuario hasta que la suma de los 
       //números introducidos supere el límite inicial.
       
//        System.out.println("Ingrese el valor limite");
//        int limit = leer.nextInt();
//        int suma = 0;
//        do {
//            System.out.println("Ingrese numero a sumar");
//            int n = leer.nextInt();
//            suma = suma + n;
//        } while (suma != limit);
//        System.out.println("La suma de los numeros ingresados supera el limite establecido");
       
        /* 11
        Realizar un programa que pida dos números enteros positivos por teclado 
        y muestre por pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.
        */        

//        System.out.println("Ingrese 2 numeros positivos para iniciar incluido el 0");
//        int n1 = leer.nextInt();
//        int n2 = leer.nextInt();
//        boolean salir;
//        int rta;
//        do {
//            System.out.println("MENU\n" +
//                "        1. Sumar\n" +
//                "        2. Restar\n" +
//                "        3. Multiplicar\n" +
//                "        4. Dividir\n" +
//                "        5. Salir\n" +
//                "        Elija opción:");
//            rta = leer.nextInt();
//
//            switch (rta){
//                case 1:
//                    int suma = n1 + n2;
//                    System.out.println(n1 + " + " + n2 + " = " + suma);
//                break;
//                case 2:
//                    int resta = n1 - n2;
//                    System.out.println(n1 + " - " + n2 + " = " + resta);
//                break;
//                case 3:
//                    int multiplicacion = n1 * n2;
//                    System.out.println(n1 + " x " + n2 + " = " + multiplicacion);
//                break;
//                case 4:
//                    int division = n1 / n2;
//                    System.out.println(n1 + " / " + n2 + " = " + division);
//                break;
//                    //  if (confirma.equals("s")
//                case 5:
//                    System.out.println("Realmente desea salir?(s/n)");
//                    String sn = leer.next();
//
//                    if (sn.equals("n")) {
//
//                        System.out.println("MENU\n" +
//                        "        1. Sumar\n" +
//                        "        2. Restar\n" +
//                        "        3. Multiplicar\n" +
//                        "        4. Dividir\n" +
//                        "        5. Salir\n" +
//                        "        Elija opción:");
//                        rta = leer.nextInt();
//                        
//                    } else {
//                        rta = 6;
//                    }
//                }
//            } while (rta <5);
//        System.out.println("Hasta la proxima");
 

        /* 12
        Realizar un programa que simule el funcionamiento de un dispositivo 
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
        Las cadenas deben llegar con un formato fijo: tienen que ser de un 
        máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, 
        la secuencia especial “&&&&&” marca el final de los envíos 
        (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el 
        formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de 
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
        deberá investigar cómo se utilizan las siguientes funciones de Java 
        Substring(), Length(), equals().
        */
            
//        int a=0,b=0,c=0;
//        String palabra;
//        System.out.println("ingrese las palabras con maximo 5 caracteres que inicien con X y terminen con O"
//                + "para finalizar el bucle inrese &&&&&");
//       
//        do {
//            palabra = leer.nextLine();
//            int longi = palabra.length();
//            
//            if (longi < 6 && "X".equals(palabra.substring(0,1)) && "O".equals(palabra.substring(longi-1,longi))) {
//                a++;
//            } else {
//                b++; 
//            }
//            }while (!"&&&&&".equals(palabra));
//            b=b-1;
//            
//        System.out.println("Informe: Hubo " + b + " lecturas incorrectas y " + a + " lecturas correctas");

        /* 13
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            * * * *
            *     *
            *     *
            * * * *
        */
        
//        System.out.println("Ingrese la cantidad de elementos del cuadrado");
//        int n = leer.nextInt();
//        
//        for(int i = 0; i < n; i++) {
//            System.out.print(" * ");
//        }
//        System.out.println();
//           
//        //centro de la forma
//        for(int i = 0; i < n-2; i++) {
//            System.out.print(" * ");
//            for(int j = 0; j < n-2; j++) {
//                System.out.print("   ");
//            }
//            System.out.println(" * ");
//        }
//        //Linea inferior
//        for(int i = 0; i < n; i++) {
//            System.out.print(" * ");
//        }
    }
}
