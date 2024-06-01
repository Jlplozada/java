import java.util.Scanner;
public class ej1_31_may {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        int wl,n;
        wl=1;
        System.out.print("1.ingresar cliente");
        System.out.print("2.terminar: ");
        System.out.println("");
        n=teclado.nextInt();
        if (n<=1) {
            while (wl>=n) {
            wl+=1;
        }
        else{
            n=0;
        }
       }
       System.out.println("numero de clientes:");
    }
}