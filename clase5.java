import java.util.Scanner;
public class clase5 {
    public static void main (String []ar ){
        float r,h,a;
        Scanner teclado = new Scanner ;
        System.out.println("ingrese primer valor (R)");
        r=teclado.nextFloat();
        System.out.println("ingrese segundo valor (H)");
        h=teclado.nextFloat();
        a=r*h;
        if (r>0) {
            if (h>0) {
                System.out.println("su area es:"+a);
            }
            else{
                System.out.println("no cumple con las condiciones");
            }
        }
        else{
            System.out.println("no cumple con las condiciones");
        }
    }
    
}