package FU_4;
import java.util.Scanner;
public class RectanguloService {
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rect = new Rectangulo();
        System.out.println("Ingrese el valor de la base");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura");
        rect.setAltura(leer.nextInt());
        return rect;
    }
    public void superficie(Rectangulo Superficie){
        int superf = Superficie.getBase()*Superficie.getAltura();
        System.out.println("La superficie es: "+ superf);
    }
    public void perimetro(Rectangulo Perimetro){
        int peri = (Perimetro.getBase()+Perimetro.getAltura())*2;
        System.out.println("El perimetro es: " + peri);
    }
    public void dibujo(Rectangulo Dibujo){
        int a = Dibujo.getBase();
        int b = Dibujo.getAltura();
        String [][] matriz = new String [a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriz [i][j]= "*";
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("["+ matriz[i][j]+ "]");
            }
            System.out.println("");
        }
    }
}
