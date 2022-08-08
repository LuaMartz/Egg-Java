/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package FU_9;


public class fu_9 {

   
    public static void main(String[] args) {
        
        Matematicas opers = new Matematicas();
        opers.setA(Math.random() * 10);
        opers.setB(Math.random() * 10);
        Service.mostrarOperandos(opers);
        System.out.println("El mayor es: " + Service.devolverMayor(opers));
        System.out.println();
        System.out.println("La potencia del mayor redondeado elevado al menor redondeado es: " 
                + Service.calcularPot(opers));
        System.out.println("La raíz cuadrada del menor es: " + Service.calcularRaiz(opers));
        
    }
    
    
}
