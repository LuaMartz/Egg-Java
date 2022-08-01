
package FU_8;

public class Cadena {
    //Atributos
    String frase;
    int longitud;
    
    //constructor

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    Cadena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getters & Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    /*public Cadena mostrarVocales(Cadena mostrar){
        int vocal = 0;
        for (int i = 0; i < mostrar.getLongitud(); i++) {
            if (mostrar.getFrase().charAt(i)) {
                
            }
        }
    }*/
}
