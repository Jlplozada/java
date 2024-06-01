import java.util.Scanner;
public class ej2_31_may{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int f,dia,año,n;
        dia=0;
        System.out.print("numero de años: ");
        n=teclado.nextInt();
        año=365*n;
        for(f=1;f<=año;f++){
            dia+=1;
        }
        System.out.println("el numero de dias que tiene el año es: "+dia);
    }
}