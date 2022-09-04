/*
 * 1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO,
a null y tratar de invocar el método esMayorDeEdad() a través de ese objeto. 
Luego, englobe el código con una cláusula try-catch para probar la nueva 
excepción que debe ser controlada.
 */
package FU_1;

public class NewMain {

    public static void main(String[] args) {
        Persona p = new Persona("Luisa", null, "Mujer", 60, 1.67);
        PersonaService serv = new PersonaService();
        try{
            if(serv.esMayorEdad(p)) {System.out.println("La persona es mayor de edad.");} 
            else {System.out.println("La persona es menor de edad.");}
        } catch(Exception e) {System.err.println(e.getMessage());}
    }
    
}
