
package FU_8;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Cadena cad = new Cadena();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        cad.setFrase(leer.nextLine());
        cad.setLongitud(cad.getFrase().length());
    }
    
}
