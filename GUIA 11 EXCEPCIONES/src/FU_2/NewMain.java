/*
2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
package FU_2;

public class NewMain {

    public static void main(String[] args) {
        ArrayService arr = new ArrayService();
        arr.crearArray();
        arr.mostrarArray();
        try {arr.modifArray();}
        catch(ArrayIndexOutOfBoundsException out) {System.err.println("\nERROR: posicion ingresada fuera de rango.");}
    
    }
    
}
