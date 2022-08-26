/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */
package FU_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in).useDelimiter("\n");
        PeliculaService serv = new PeliculaService();
        ArrayList<Pelicula> movies = new ArrayList(); String resp;
        do {
            System.out.print("¿Desea ingresar una nueva película? [S/N]: ");
            resp = read.next();
            if(!resp.equalsIgnoreCase("n")) {
                movies.add(serv.crearPelicula());
            }
        } while(!resp.equalsIgnoreCase("n"));
        System.out.println();
        System.out.println("• Películas ingresadas: ");
        serv.mostrarPeliculas(movies);
        System.out.println();
        System.out.println("• Películas de más de una hora: ");
        serv.mostrarPeliculas(serv.masDeUnaHora(movies));
        System.out.println();
        System.out.println("• Ordenadas según su duración: ");
        System.out.print("Descendente: ");
        Collections.sort(movies, Pelicula.ordenarPorDuracion);
        serv.mostrarPeliculas(movies);
        System.out.println();
        System.out.print("Ascendente: ");
        Collections.reverse(movies);
        serv.mostrarPeliculas(movies);
        System.out.println();
        System.out.println("• Ordenadas por títulos: ");
        Collections.sort(movies, Pelicula.ordenarPorTitulo);
        Collections.reverse(movies);
        serv.mostrarPeliculas(movies);
        System.out.println();
        System.out.println("• Ordenadas por Director: ");
        Collections.sort(movies, Pelicula.ordenarPorDirector);
        Collections.reverse(movies);
        serv.mostrarPeliculas(movies);
    
    }
    
}
