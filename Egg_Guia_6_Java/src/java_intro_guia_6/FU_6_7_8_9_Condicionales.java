package java_intro_guia_6;

import java.util.Scanner;

public class FU_6_7_8_9_Condicionales {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //6
        //Crear un programa que dado un numero determine si es par o impar.
        
//        System.out.println("Ingreses un numero");
//        int num = leer.nextInt();
//        
//        if (num%2 == 0) {
//            System.out.println("El numero " + num + " es par");
//        }else{
//            System.out.println("El numero " + num + " es impar");
//        }

        //7
        //Crear un programa que pida una frase y si esa frase es igual a 
        //“eureka” el programa pondrá un mensaje de Correcto, sino mostrará un 
        //mensaje de Incorrecto. Nota: investigar la función equals() en Java.
        
//        boolean pass;
//        do {
//            System.out.println("Ingrese la contraseña");
//            String pss = leer.nextLine();
//            if (pss.equals("eureka")) {
//                System.out.println("Contraseña correcta");
//                pass = true;
//            }else {
//                System.out.println("Contraseña incorrecta, intente de nuevo");
//                pass = false;
//            }
//        } while (pass != true);
        
        //8
        //Realizar un programa que solo permita introducir solo frases o 
        //palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 
        //de largo se deberá de imprimir un mensaje por pantalla que diga 
        //“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        //Nota: investigar la función Lenght() en Java.
        
        
//        boolean ent;
//        do {
//            System.out.println("Ingrese palabra de 8 caracteres");
//            String word = leer.nextLine();
//            if (word.length()== 8) {
//            System.out.println("CORRECTO");
//            ent = true;
//            } else {
//            System.out.println("INCORRECTO");
//            ent = false;
//            }
//        } while (ent != true);
        
        //9
        //Escriba un programa que pida una frase o palabra y valide si la 
        //primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
        //se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        //en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        //la función Substring y equals() de Java.
        
//        boolean cond;
//        do {
//            System.out.println("Ingrese palabra que inicie por A");
//            String palabra = leer.nextLine();
//            if (palabra.substring(0,1).equals("a")) {
//                System.out.println("Correcto");
//                cond = true;
//            } else {
//                System.out.println("Incorrecto, intente de nuevo");
//                cond = false;
//            }
//        } while (cond != true);
        
        
    }
    
}
