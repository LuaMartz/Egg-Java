
package FU_9;



public class Service {
    public static double devolverMayor(Matematicas opers){
        return Math.max(opers.getA(), opers.getB());
    }
    
    public static int calcularPot(Matematicas opers){
        int potencia = 1;
        int base = (int) Math.round(devolverMayor(opers));
        int exponente = (int) Math.round(Math.min(opers.getA(), opers.getB()));
        
        for(int i = 0; i< exponente; i++) {
            potencia = potencia * base;
        }
        if (exponente == 0) {
            potencia = 1;
        }
        return potencia;
    }
    
    public static double calcularRaiz(Matematicas opers){
        double menor = Math.abs(Math.min(opers.getA(), opers.getB()));
        //sqrt Returns the correctly rounded positive square root of a double value.
        return Math.sqrt(menor);
    }
    
    public static void mostrarOperandos(Matematicas opers){
        System.out.println("OPERANDOS. ");
        System.out.println();
        System.out.println("Numero 1: " + opers.getA());
        System.out.println("Numero 2: " + opers.getB());
        System.out.println();
    }
}
