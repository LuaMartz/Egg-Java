
package FU_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CuentaService newCuenta = new CuentaService();
        Cuenta crear = newCuenta.crearCuenta();
        
        System.out.println("1. Ingreso y Retiro"
                + "\n 2. Extracción rápida");
        int opc = leer.nextInt();
        
        switch (opc){
            case 1:
                newCuenta.ingresar(crear);
                newCuenta.retirar(crear);
                break;
            case 2:
                newCuenta.extraccionRapida(crear);
                break;
        }
     
        newCuenta.consultarSaldo(crear);
        newCuenta.consultarDatos(crear);
        
    }
    
}
