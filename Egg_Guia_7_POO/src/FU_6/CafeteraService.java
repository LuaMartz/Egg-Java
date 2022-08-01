
package FU_6;

import java.util.Scanner;

public class CafeteraService {
    
    public Cafetera llenarCafetera(Cafetera llenar){
        int cm = llenar.getCapacidadMaxima();
        llenar.setCapacidadActual(cm);
        return llenar;
    }

    public void servirTaza(Cafetera servir){
        Scanner leer = new Scanner(System.in);
        Cafetera ser = new Cafetera();
        
        System.out.println("Ingrese el tamaño de la taza vacia");
        servir.setCapacidadMaxima(leer.nextInt());
        System.out.println("LLenando la taza...");
        
        int max = servir.getCapacidadMaxima();
        int act = servir.getCapacidadActual();
        
        if (act == max) {
            System.out.println("Taza llenada completamente");
        }else if (act< max && act > 0){
            System.out.println("No se ha llenado la taza completamente");
            System.out.println(act + "llenado actualmente");
        }
    } 
    
    public Cafetera vaciarCafetera(Cafetera vac){
        vac.setCapacidadActual(0);
        return vac;
    }
    
    public void agregarCafe(Cafetera agg){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a agregar");
        
        System.out.println("Llenando taza de capacidad maxima " + agg.getCapacidadMaxima() +
                "con la cantidad de " + agg.getRelleno());
    }

}
