package FU_7;

public class Main {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        p1.crearPersona(p1);
        int r1 = p1.calcularIMC(p1);
        boolean t1 = p1.esMayorDeEdad(p1);
        
        Persona p2 = new Persona();
        p2.crearPersona(p2);
        int r2 = p2.calcularIMC(p2);
        boolean t2 = p2.esMayorDeEdad(p2);
        
        Persona p3 = new Persona();
        p3.crearPersona(p3);
        int r3 = p3.calcularIMC(p3);
        boolean t3 = p3.esMayorDeEdad(p3);
        
        Persona p4 = new Persona();
        p4.crearPersona(p4);
        int r4 = p4.calcularIMC(p4);
        boolean t4 = p4.esMayorDeEdad(p4);
        
        int bajo= 0;
        int normal = 0;
        int sobre = 0;
        for (int i = 0; i < 4; i++) {
            if (r1 == -1 || r2 == -1 || r3 == -1 || r4 == -1) {
                bajo += 1;
            }else if (r1 == 0 || r2 == 0 || r3 == 0 || r4 == 0) {
                normal += 1;
            }else if (r1 == 1 || r2 == 1 || r3 == 1 || r4 == 1) {
                sobre += 1;
            }
        }
        int tb = bajo*25;
        int tn = normal*25;
        int ts = sobre*25;
        System.out.println("Bajo peso= " + tb + "%"
                + "\n Peso ideal= " + tn + "%"
                        + "\n Sobre peso= " + ts + "%");
        
        int menor = 0;
        int mayor = 0;
        for (int i = 0; i < 4; i++) {
            if (t1 == true || t2 == true || t3 == true || t4 == true) {
                menor += 1;
            } else if (t1 == false || t2 == false || t3 == false || t4 == false) {
                mayor += 1;
            }
        }
        int tmn = menor*25;
        int tmy = mayor*25;
        System.out.println("Menores de edad= " + tmn + "%"
                + "\n Mayores de edad= " + tmy + "%");
    }
    
}
