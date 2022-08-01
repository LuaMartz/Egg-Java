
package Entidad;

import java.util.Scanner;

public class Persona {
    // atributos
    public String nombre;
    public int num;
    public boolean boo;
    
    Scanner leer = new Scanner (System.in);
    
    // constructor vacio
    public Persona(){
        
    }
    
    // constructor con los atributos poasados por los parametros
    public Persona(String nombre, int num, boolean boo) {
        this.nombre = nombre;
        this.num = num;
        this.boo = boo;
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }
    
    //metodo
    public Persona crearPersona(){
        // objeto con atributos vacios
        Persona personaCompleta = new Persona();
        
        System.out.println("Ingrese el nombre");
        // se usa el objeto para invocar el metodo SET
        // con scanner se recibe la info
        personaCompleta.setNombre(leer.next());
        // metodo retorna objeto con atributos llenos
        return personaCompleta;
    }
    
}
    
