package FU_2;

import java.util.Scanner;

public class CircService {
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner (System.in);
    
        // objeto con atributos vacios
        Circunferencia circun = new Circunferencia();        
        // se usa el objeto para invocar el metodo SET
        // con scanner se recibe la info
        System.out.println("Ingrese el Radio");
        // metodo retorna objeto con atributos llenos
        circun.setRadio(leer.nextFloat());
        return circun;
    }
    public void area (Circunferencia Area){
        double area = Math.PI*Math.pow(Area.getRadio(), 2);
        System.out.println("Area= "+ area);
    }
    public void perimetro (Circunferencia Perimetro){
        double perimetro = 2*Math.PI*Perimetro.getRadio();
        System.out.println("Perimetro= "+ perimetro);
    }
}

