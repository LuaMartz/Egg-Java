/*
 * 3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package FU_3_y_4;

import java.util.*;

public class Main implements Tools {
    public static void main(String[] args) {
        DivisionNumero dN = new DivisionNumero();
        try {
            System.out.println(" DIVISION DE CARACTERES NUMERICOS. [a / b]\n");
            System.out.print("» Ingrese a: ");
            Integer a = dN.stringToInt(read.next());
            System.out.print("» Ingrese b: ");
            Integer b = dN.stringToInt(read.next());
            System.out.println("\nLa division es: " + dN.divNums(a, b));
        }
        catch(InputMismatchException iE) {System.err.println("\nERROR: debe ingresar un caracter numerico.");}
        catch(NumberFormatException nE) {System.err.println("\nERROR: el caracter ingresado debe ser del tipo numerico.");}
        catch(ArithmeticException aE) {System.err.println("\nERROR: no puede realizarse una division entre 0.");}
    }
}