/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package FU_11;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Date fechaAct = new Date();
        System.out.println("EDAD");
        System.out.println();
        System.out.print("» Ingrese día de nacimiento: ");
        int dia = read.nextInt();
        System.out.print("» Ingrese mes de nacimiento: ");
        int mes = read.nextInt() - 1;
        System.out.print("» Ingrese anio de nacimiento: ");
        int anio = read.nextInt() - 1900;
        Date fechaNac = new Date(anio, mes, dia);
        System.out.println();
        System.out.println("Fecha actual: " + fechaAct);
        System.out.println("Fecha de nacimiento: " + fechaNac);
        System.out.println();
        int edad = (fechaAct.getYear() - fechaNac.getYear()) - 1;
        
        if(fechaAct.getMonth() >= fechaNac.getMonth()) {
            if(fechaAct.getDate() >= fechaNac.getDate()) {
                edad++;
            }
        } 
        
        if(fechaAct.getDate() == fechaNac.getDate()) {
            System.out.println("¡Felíz cumpleaños!");
        }
        System.out.print("Usted tiene: " + edad + " anios");
        
    }
    
}
