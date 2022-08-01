
package FU_2;

public class Main {

    public static void main(String[] args) {
        /*
        Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia
e) Método perimetro(): para calcular el perímetro
        */
        //Instanciar objeto de tipo servicio para acceder a sus metodos
        CircService nuevaCirc = new CircService();
        Circunferencia crear = nuevaCirc.crearCircunferencia();
        
        //Alojar en retorno del metodo 
        nuevaCirc.area(crear);
        nuevaCirc.perimetro(crear);
    }
}
