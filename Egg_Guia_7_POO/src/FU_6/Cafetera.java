
package FU_6;



public class Cafetera {
    // Atributos
    private int capacidadMaxima;
    private int capacidadActual;
    int taza;
    int relleno;
 //constructores

    public Cafetera(int capacidadMaxima, int capacidadActual, int relleno) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.relleno = relleno;
    }
  
    public Cafetera() {
    }

    
    // GyS
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getRelleno() {
        return relleno;
    }

    public void setRelleno(int relleno) {
        this.relleno = relleno;
    }
    
   
    
}
