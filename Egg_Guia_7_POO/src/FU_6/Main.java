
package FU_6;

public class Main {
    
    public static void main(String[] args) {
        CafeteraService caf = new CafeteraService();
        Cafetera coffee = new Cafetera();
        caf.llenarCafetera(coffee);
        caf.servirTaza(coffee);
        caf.vaciarCafetera(coffee);
        caf.agregarCafe(coffee);   
    }
}
