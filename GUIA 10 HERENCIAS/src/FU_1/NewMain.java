/**
 * 1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package FU_1;

public class NewMain {

    public static void main(String[] args) {
        Animal perro = new Perro("Stitch", "carne", "Boxer", 4);
        perro.HacerRuido();
        perro.Alimentarse();
        Animal gato = new Gato("Garfield", "sardinas", "Siamés", 6);
        gato.HacerRuido();
        gato.Alimentarse();
        Animal caballo = new Caballo("Tornado", "pastura", "Pura sangre", 8);
        caballo.HacerRuido();
        caballo.Alimentarse();    }
    
}
