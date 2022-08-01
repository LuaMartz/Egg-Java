
package FU_1;

import java.util.Scanner;

public class LibroService {
    public Libro crearLibro(){
        
        Scanner leer = new Scanner (System.in);
    
        // objeto con atributos vacios
        Libro libro = new Libro();
    
        // se usa el objeto para invocar el metodo SET
        // con scanner se recibe la info
        System.out.println("Ingrese el ISBN");
        // metodo retorna objeto con atributos llenos
        libro.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el Titulo");
        libro.setTitulo(leer.next());
        
        System.out.println("Ingrese el Autor");
        libro.setAutor(leer.next());
        
        System.out.println("Ingrese el Numero de paginas");
        libro.setPaginas(leer.nextInt());
        
        return libro;
    }
    
    public void mostrarLibro(Libro p_libro){
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        System.out.println("ISBN: " + p_libro.getISBN());
        
        System.out.println("Titulo: " + p_libro.getTitulo());
        
        System.out.println("Autor: " + p_libro.getAutor());
        
        System.out.println("Numero de paginas: " + p_libro.getPaginas());
        
    }
}
