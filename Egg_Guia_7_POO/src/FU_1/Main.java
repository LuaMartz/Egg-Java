
package FU_1;

public class Main {

    public static void main(String[] args) {
        
        //Instanciar objeto de tipo servicio para acceder a sus metodos
        LibroService nuevoLibro = new LibroService();
        Libro libroo = nuevoLibro.crearLibro();
        
        //Alojar en retorno del metodo 
        nuevoLibro.mostrarLibro(libroo);
    }
    
}
