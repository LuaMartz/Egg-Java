
package FU_1;

public class NewMain {

    public static void main(String[] args) {
 
        Persona eze = new Persona("Luisa Maria", "Martinez", 123456789, 19);
        Persona lau = new Persona("Maria", "Ramirez", 9785612, 23);
        Perro lula = new Perro("Doky", "Huggy", "Pequeño", 7);
        Perro tizon = new Perro("Sora", "Criollo Americano", "Grande", 4);
        eze.setPerro(lula); // Lu adopta a Doky
        System.out.println("Primer persona: ");
        System.out.println(eze);
        System.out.println("Perro adoptado: ");
        System.out.println(eze.getPerro());
        System.out.println();
        lau.setPerro(tizon); // Lau adopta a Tizón
        System.out.println("Segunda persona: ");
        System.out.println(lau);
        System.out.println("Perro adoptado: ");
        System.out.println(lau.getPerro());
    }
    
}
