
package FU_7;

import java.util.Scanner;

public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public char sexo;
    public float peso;
    public float altura;
    
    //Constructor

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    Persona() {
    }
    
    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public Persona crearPersona(Persona cre){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre:");
        cre.setNombre(leer.nextLine());
        
        System.out.println("Edad:");
        cre.setEdad(leer.nextInt());
        
        System.out.println("Sexo: \nH. Hombre \n M. Mujer \n O. otro");
        cre.setSexo(Character.toLowerCase(leer.next().charAt(0)));
        
        System.out.println("Peso:");
        cre.setPeso(leer.nextFloat());
        
        System.out.println("Altura:");
        cre.setAltura(leer.nextFloat());
        
//        if (!cre.getSexo().equals("H")&& cre.getSexo().equals("M")&& cre.getSexo().equals("O")) {
//            System.out.println("Valor invalido");
//        }
        
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
