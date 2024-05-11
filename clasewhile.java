import java.util.Scanner;
public class clasewhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float rep,sum,total,prom;
        rep=1; sum = 0; total=0; prom=0;

        
        while (rep <=10) {
            System.out.print("ingrese numero: ");
            sum=teclado.nextFloat();
            total += sum;
            rep+=1;
        }
        prom=total/10;
        System.out.println("/la suma es: "+ total +" /promedio: "+prom);
    }
}
