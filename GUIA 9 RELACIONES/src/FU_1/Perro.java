
package FU_1;

public class Perro {

    private String raza, name, tamaño;
    private int edad;

    public Perro() {
    }

    public Perro(String name, String raza, String tamaño, Integer edad) {
        this.name = name;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
    
    public String getTamaño() {return tamaño;}
    public void setTamaño(String raza) {this.raza = raza;}
    
    public Integer getEdad() {return edad;}
    public void setEdad(Integer edad) {this.edad = edad;}
    
    
    @Override
    public String toString() {return "(Nombre: " + name + " | Raza: " + raza + " | Edad: " + edad + " | Tamaño: " + tamaño + ");";}
}
