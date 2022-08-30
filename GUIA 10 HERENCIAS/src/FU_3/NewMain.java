/*
 * 3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package FU_3;

import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        int precLavs = 0, precTvs = 0, precTot = 0;
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        Lavadora lv = new Lavadora();
        Lavadora lv1 = new Lavadora(85, "gris", 'B', 25);
        Lavadora lv2 = new Lavadora(85, "blanco", 'A', 35);
        Televisor tv1 = new Televisor(true, 55, "negro", 'A', 20);
        Televisor tv2 = new Televisor(false, 60, "gris", 'A', 25);
        electrodomesticos.add(lv1);
        electrodomesticos.add(lv2);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        for(Electrodomestico e: electrodomesticos) {
            e.precioFinal();
            precTot += e.getPrecio();
            if(e.getClass().equals(lv.getClass())) {precLavs += e.getPrecio();}
            else {precTvs += e.getPrecio();}
        }
        System.out.println("\nPrecio de lavadoras: $" + precLavs);
        System.out.println("\nPrecio de televisores: $" + precTvs);
        System.out.println("\nPrecio total de electrodomesticos: $" + precTot);
    }
    
}
