
package java_intro_guia_6;

import java.util.Scanner;

public class MO_7_8_9_10_Bucles {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println("seleccione una opcion: ");
        System.out.println("a");
        System.out.println("b");
        String opc = leer.nextLine();
        
        // Switch
        
        switch(opc){
            case "a":
                System.out.println("Selecciono la opcion A");
        break;
            case "b":
                System.out.println("Selecciono la opcion B");
        break;
            default:
                System.out.println("selecciono una opcion invalida");
        }
        
        /* MO 7
        Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
        permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        gasolina”.
        o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        hormigón”.
        o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
        alimenticia”.
        o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        válido para tipo de bomba”
         */
        System.out.println("Elija el tipo de motor que desea");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
        break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
        break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
        break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
        break;
            default:
                System.out.println("No existe un tipo de valor valido para tipo de bomba");
        }
        /* MO 8
        Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        pedirá de nuevo hasta que la nota sea correcta.
         */      
        System.out.println("Ingrese la nota"); 
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        
        System.out.println("Nota correcta");

        /* MO 9
        Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        Nota: recordar el uso de la sentencia break.
         */
        int i = 0;
        int num;
        int j = 0;
        do {
            System.out.println("Ingrese numeros a sumar");
            System.out.println("Ingrese 0 para salir del bucle");
            System.out.println("Si ingresa numeros negativos no seran sumados");
            
            num = leer.nextInt();
            
            if (num > 0){
               i = i + num;
            }
            j = j + 1;
            if (j == 20){
                break;
            }
        } while (num != 0);
        
        System.out.println("Suma total: " + i);
        
        /* MO 10
        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
         */
        int m = 0;
        for (int k = 0; k < 20; k++) {
            while (m <= 4){
                System.out.println("Ingrese 1 numero");
                int ast = leer.nextInt();
                m = m + 1;
                for (int l = 0; l < ast; l++) {
                    System.out.print("*");
                }
            }
        }
        
    }
}
