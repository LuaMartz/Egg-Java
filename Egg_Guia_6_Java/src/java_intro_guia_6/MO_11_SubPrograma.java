
package java_intro_guia_6;

import java.util.Scanner;

public class MO_11_SubPrograma {
/* MO 11
        Escribir un programa que procese una secuencia de caracteres ingresada 
        por teclado y terminada en punto, y luego codifique la palabra o frase 
        ingresada de la siguiente manera: cada vocal se reemplaza por el 
        carácter que se indica en la tabla y el resto de los caracteres 
        (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        a e i o u
        @ # $ % *
        Realice un subprograma que reciba una secuencia de caracteres y retorne
        la codificación correspondiente. 
        Utilice la estructura “según” para la transformación.
        Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        Conversor(frase);
        
       
        //sFernando = sFernando.replace('e','a').replace('i','a')
               //.replace('o','a').replace('u','a');
               
               //variable.length() saca la longitud de la cadena 
               //variable.charAt() saca una letra de la posicion que queramos
    }
    // c= frase.replace('u', '*');
    /*
    a e i o u
    @ # $ % *
    */
    
public static void Conversor(String frase){
       
       //bucle for que parte desde hasta la longitud de la cadena la cual se toma con:
       //frase.length() y aumenta en uno en cada caso
    for (int i = 0; i < frase.length(); i++) {
            
            //Esta linea cumple la funcion de subcadena seria como:
            // c=Subcadena(frase,i,i)
        char c = frase.charAt(i);
           
            
            //Condicional segun que segun C que por cada paso guarda una letra y cumple las condicones
        switch (c) {
               
            case 'a':
            c= '@';
        break;
            case 'e':
            c='#';
        break;
            case 'i':
            c='$';
        break;
            case 'o':
            c='%';
        break;
            case 'u':
                c='*';
        break;
            default:
        
           }
            System.out.print(c);
        }
    }
}
