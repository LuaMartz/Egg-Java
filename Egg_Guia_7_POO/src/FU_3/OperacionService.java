package FU_3;
import java.util.Scanner;
public class OperacionService {
    public Operacion crearOperacio(){
        Scanner leer = new Scanner(System.in);
        
        Operacion op = new Operacion();
        
        System.out.println("ingrese 2 numeros");
        op.setNumero1(leer.nextInt());
        op.setNumero2(leer.nextInt());
        return op;
    }
    public void sumar(Operacion Sumar){
        int totalS = Math.addExact(Sumar.getNumero1(), Sumar.getNumero2());
        System.out.println(Sumar.getNumero1() + "+" + Sumar.getNumero2() + "=" + totalS);
    }
    public void restar(Operacion Restar){
        int totalR = Restar.getNumero1() - Restar.getNumero2();
        System.out.println(Restar.getNumero1() + "-" + Restar.getNumero2() + "=" + totalR);
    }
    public void multiplicar(Operacion Multiplicar){
        int totalM;
        if (Multiplicar.getNumero1()== 0||Multiplicar.getNumero2()==0){
            totalM=0;
            System.out.println(Multiplicar.getNumero1()+"x"+Multiplicar.getNumero2()+"="+totalM);
            System.out.println("Error, se esta multiplicando por 0");
        }else{
            totalM=Math.multiplyExact(Multiplicar.getNumero1(), Multiplicar.getNumero2());
            System.out.println(Multiplicar.getNumero1()+"x"+Multiplicar.getNumero2()+"="+totalM);
        }
    }
    public void dividir(Operacion Dividir){
        int totalD;
        if (Dividir.getNumero1()== 0||Dividir.getNumero2()==0){
            totalD=0;
            System.out.println(Dividir.getNumero1()+"x"+Dividir.getNumero2()+"="+totalD);
            System.out.println("Error, se esta dividiendo por 0");
        }else{
            totalD=Dividir.getNumero1()/Dividir.getNumero2();
            System.out.println(Dividir.getNumero1()+"x"+Dividir.getNumero2()+"="+totalD);
        }
    }
}
