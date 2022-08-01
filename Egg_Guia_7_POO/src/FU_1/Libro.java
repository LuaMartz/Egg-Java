
package FU_1;

public class Libro {
    
    
    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
    */
    
    // Atributos
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Paginas;

    public Libro(int ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public Libro() {
    }

    // Setters
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    
    // Getters
    public int getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getPaginas() {
        return Paginas;
    }

    
    
}
