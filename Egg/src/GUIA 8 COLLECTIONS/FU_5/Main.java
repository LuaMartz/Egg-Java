/*
 5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario
 */
package FU_5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n"); String resp; 
        PaisService serv = new PaisService(); HashSet<Pais> paises = new HashSet();
        do {
            System.out.print("» ¿Desea ingresar un nuevo país? [S/N]: "); resp = read.next();
            if(!resp.equalsIgnoreCase("n")) {
                paises.add(serv.crearPais());
            }
        } while(!resp.equalsIgnoreCase("n"));
        System.out.print("• Conjunto de países: ");
        serv.mostrarPaisesHash(paises);
        System.out.println();
        System.out.print("• Conjunto de países ordenados alfabéticamente: ");
        TreeSet<Pais> paisesTree = new TreeSet(Collections.reverseOrder(Pais.ordenName));
        serv.llenarTree(paises, paisesTree);
        serv.mostrarPaisesTree(paisesTree);
        System.out.println();
        serv.eliminarPais(paisesTree);
        System.out.println();
        System.out.print("• Conjunto sin el país ingresado: ");
        serv.mostrarPaisesTree(paisesTree);
    }
    
}
