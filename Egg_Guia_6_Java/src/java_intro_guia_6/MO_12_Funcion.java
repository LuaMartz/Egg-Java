
package java_intro_guia_6;

import java.util.Scanner;

public class MO_12_Funcion {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        /* MO 12
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.
        */
        System.out.println("Ingrese 2 numeros para conocer el multiplo");
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = a % b;
        EsMultiplo(a,b,c);
    }
   
    public static void EsMultiplo (int a, int b, int c){
        
        if (c != 0){
            System.out.println("El numero " + a + " es multiplo del numero " + b );
        }else {
            System.out.println("El numero " + a + "NO es multiplo del numero " + b );
        }
    }
}
    

