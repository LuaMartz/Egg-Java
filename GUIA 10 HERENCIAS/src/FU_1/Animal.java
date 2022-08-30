/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FU_1;

public abstract class Animal {
    
    // Attributes
    
    protected String nombre, alimento, raza;
    protected int edad;

    // Constructors    
    
    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    // Methods of the class
    
    public void Alimentarse() {System.out.println(nombre + " morfando " + alimento + "...");}
    public abstract void HacerRuido();
}