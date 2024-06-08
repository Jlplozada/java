import java.util.Scanner;
public class ej1_31_may {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        float d_importe;
        int n_cliente,wl,l_cliente;
        // logica
        wl=0;
        // contable
        d_importe=0;n_cliente=0;
        while (wl==1) {
            System.out.println("1.ingresar cliente");
            System.out.println("2.terminar dia");
            l_cliente=teclado.nextInt();
        }
        
        System.out.println("importe del dia: "+d_importe);        
        System.out.println("numero de clientes: "+n_cliente);
    }
}