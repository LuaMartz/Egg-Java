
package FU_5;

import java.util.Scanner;

public class CuentaService {
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta(){
        
        Scanner leer = new Scanner(System.in);
        
        Cuenta cta = new Cuenta();
        
        System.out.println("Ingrese numero de cuenta");
        cta.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese DNI");
        cta.setDNI(leer.nextLong());
        
        System.out.println("Ingrese Saldo actual");
        cta.setSaldoActual(leer.nextInt());
        
        System.out.println("Ingrese valor a ingresar");
        cta.setIngreso(leer.nextDouble());
        
        System.out.println("Ingrese valor a retirar");
        cta.setRetiro(leer.nextDouble());
        
        return cta;
    }
    /*
    Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
    */
    public void ingresar(Cuenta ing){
        ing.setSaldoFinal(ing.getSaldoActual()+ ing.getIngreso());
        System.out.println("---");
        System.out.println("Consignacion exitosa ");
        System.out.println("---");
    }
    /*
    Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
    */
    public void retirar(Cuenta ret){
        
        if (ret.getRetiro()<= ret.getSaldoActual()) {
            ret.setSaldoFinal(ret.getSaldoFinal() - ret.getRetiro());
            System.out.println("---");
            System.out.println("Retiro exitoso");
            System.out.println("Saldo final: %" + ret.getSaldoFinal());
            System.out.println("---");
        }else {
            System.out.println("Saldo insuficiente");
            ret.setSaldoActual(0);
            System.out.println("Saldo actual: $" + ret.getSaldoActual());
        }
    }
    /*    
    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
    */
    public void extraccionRapida(Cuenta ext){
        double porc = ext.getSaldoActual()* 0.20;
        if (ext.getRetiro() >= porc && ext.getRetiro()<= porc) {
            System.out.println("Retiro exito del 20% del saldo actual");
        }else {
            System.out.println("Error, retiro excede el 20% permitido");
        }
    }
    public void consultarSaldo(Cuenta sld) {
        System.out.println("Saldo actual: $" + sld.getSaldoFinal());
    }
    public void consultarDatos(Cuenta dts) {
        System.out.println("\n Numero de cuenta: " + dts.getNumeroCuenta() + 
                "\n DNI: " + dts.getDNI() + 
                "\n Saldo inicial: $" + dts.getSaldoActual() + 
                "\n Valor a ingresar: $" + dts.getIngreso() + 
                "\n Valor a retirar: $" + dts.getRetiro() + 
                "\n Saldo final: $" + dts.getSaldoFinal());
        
    }
}
