
package FU_7;

import java.util.Scanner;

public class PersonaService {
    
    public Persona crearPersona(Persona cre){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre:");
        cre.setNombre(leer.nextLine());
        
        System.out.println("Edad:");
        cre.setEdad(leer.nextInt());
        
        System.out.println("Sexo: \n H. Hombre \n M. Mujer \n O. otro");
        cre.setSexo(leer.next().charAt(0));
        
        System.out.println("Peso:");
        cre.setPeso(leer.nextFloat());
        
        System.out.println("Altura:");
        cre.setAltura(leer.nextFloat());
        return cre;
    }
    
    public  int calcularIMC(Persona cal){
        double pes = cal.getPeso();
        double altur = Math.pow(cal.getAltura(), 2);
        double PI = (pes/(altur));
        int ret = 0;
        if (PI < 20) {
            ret = -1;
        }else if (PI >= 20 && PI <= 25){
            ret = 0;
        }else if (PI > 25){
            ret = 1;
        }
        System.out.println(ret);
        return ret;
    }
    
    public boolean esMayorDeEdad(Persona es){
        boolean re;
        if (es.getEdad()>=18) {
            System.out.println("Es mayor de edad");
            re = true;
        }else {
            System.out.println("La persona no es mayor de edad");
            re = false;
        }
        return re;
    }
}
