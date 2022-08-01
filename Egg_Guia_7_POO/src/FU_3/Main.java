
package FU_3;


public class Main {

    
    public static void main(String[] args) {
        OperacionService newOp = new OperacionService();
        Operacion crear = newOp.crearOperacio();
        newOp.sumar(crear);
        newOp.restar(crear);
        newOp.multiplicar(crear);
        newOp.dividir(crear);
        
    }
    
}
