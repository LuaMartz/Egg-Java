package FU_4;

public class Main {

    public static void main(String[] args) {
        RectanguloService newRect = new RectanguloService();
        Rectangulo crear = newRect.crearRectangulo();
        newRect.superficie(crear);
        newRect.perimetro(crear);
        newRect.dibujo(crear);
    }
    
}
