package egg_guia_7_poo;

import java.util.Scanner;
import Entidad.Persona;

public class Egg_Guia_7_POO {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Instanciacion constructor vacio
        Persona primeraPersona = new Persona();
        
        // Instanciacion constructor por parametro
        Persona segundaPersona = new Persona("Luisa",5,true);
        
        // Metodos
        primeraPersona.setNombre("Marco");
        
        segundaPersona.getNombre();
        
        primeraPersona.setBoo(false);
        
        primeraPersona.setNum(0);
        
        segundaPersona.getNum();
        
        //Instanciar objeto de tipo servicio para acceder a sus metodos
        Persona persoServicio = new Persona();
        
        //Alojar en retorno del metodo 
        Persona terceraPersona = persoServicio.crearPersona();
        
    }
    }
    
