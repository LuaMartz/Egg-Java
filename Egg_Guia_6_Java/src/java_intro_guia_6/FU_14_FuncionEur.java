
package java_intro_guia_6;

import java.util.Scanner;

public class FU_14_FuncionEur {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 14
        Crea una aplicación que a través de una función nos convierta una 
        cantidad de euros introducida por teclado a otra moneda, estas pueden 
        ser a dólares, yenes o libras. La función tendrá como parámetros, la 
        cantidad de euros y la moneda a converir que será una cadena, este no 
        devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €
        */
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double eur = leer.nextDouble();
        
        System.out.println("Seleccione la opcion a la que desea convertir:\n"
                + "1. Dolares\n"
                + "2. Yenes\n"
                + "3. Libras\n");
        int conv = leer.nextInt();
        
        conversor(eur,conv);
    }
    public static void conversor(double eur, int conv){
        switch (conv) {
            case 1:
                double EurUsd = 1.28611 * eur;
                System.out.println(eur + " € = $ " + EurUsd + "USD");
                break;
            case 2:
                double EurYen = 129.852 * eur;
                System.out.println(eur + "€ = " + EurYen + "yenes");
                break;
            case 3:
                double EurLib = 0.86 * eur;
                System.out.println(eur + " € = " + EurLib + "libras");
        }
                
    }
}
