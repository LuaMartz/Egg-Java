
package java_intro_guia_6;

import java.util.Scanner;

public class FU_15_16_17_Vector {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        /* 15. 
        Realizar un algoritmo que rellene un vector con los 100 primeros 
        números enteros y los muestre por pantalla en orden descendente.
        */
        
//        int[] vector = new int[100];
//        
//        for (int i = 0; i < 100; i++){
//            vector[i] = 100-i; 
//           }
//        for (int i = 0; i < 100; i++){
//            System.out.print("[" + vector[i] + "]");
//        }
//        System.out.println("");

        /* 16
        Realizar un algoritmo que rellene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un numero a buscar en el vector. 
        El programa mostrará donde se encuentra el numero y si se encuentra 
        repetido
        */
        
//        System.out.println("Ingrese tamaño del vector");
//        int n = leer.nextInt();
//        
//        int[] vect = new int [n];
//        
//        for (int i = 0; i < n; i++) {
//            int aleatorio = (int)(Math.random()*100);
//            vect[i] = aleatorio;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print("[" + vect[i] + "]");
//        }
//        System.out.println("");
//        
//        System.out.println("Ingrese numero a buscar del 0 al 100");
//        int buscar = leer.nextInt();
//        int cont = 0, contt = 0;
//        for (int i = 0; i < vect.length; i++) {
//            if (vect[i] == buscar) {
//                cont++;
//                System.out.println("El elemento se encuentra en la posicion:" + i);
//            }else {
//                contt--;
//            
//            }
//        }
//        if (cont > 0) {
//            System.out.println("El numero se encuentra " + cont + " veces");
//        } else if (contt < 0){
//            System.out.println("El numero no se encuentra en el vector");
//        }

        /* 17
        Recorrer un vector de N enteros contabilizando cuántos números 
        son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
//        System.out.println("Ingrese el tamaño del vector");
//        int nn = leer.nextInt();
//        
//        int[] vector = new int[nn];
//        
//        for (int i = 0; i < nn; i++){
//            System.out.println("Ingrese los numeros para rellenar el vetor");
//            vector[i] = leer.nextInt(); 
//        }
//        for (int i = 0; i < nn; i++){
//            System.out.print("[" + vector[i] + "]");
//        }
//        System.out.println("");
//            
//        int cifras;
//        int con1 = 0, con2 = 0, con3 = 0, con4 =0, con5 = 0;
//        
//        for (int i = 0; i < vector.length; i++) {
//            
//            cifras= 0;    //esta variable es el contador de cifras
//            
//            while(vector[i]!=0){             //mientras a n le queden cifras
//                
//                vector[i] = vector[i]/10;         //le quitamos el último dígito
//                cifras++;          //sumamos 1 al contador de cifras
//                
//                
//            }
//            switch (cifras) {
//                    case 1:
//                    con1++;
//                break;
//                    case 2:
//                    con2++;
//                break;
//                    case 3:
//                    con3++;
//                break;
//                    case 4:
//                    con4++;
//                break; 
//                    case 5:
//                    con5++; 
//                break;
//            }
//        }
//        System.out.println("Hay " + con1 + "numeros con 1 cifra \n"
//                  + "Hay " + con2 + " numeros con 2 cifras \n"
//                  + "Hay " + con3 + " numeros con 3 cifras \n"
//                  + "Hay " + con4 + " numeros con 4 cifras \n"
//                  + "Hay " + con5 + " numeros con 5 cifras \n");  

        
    }
}
