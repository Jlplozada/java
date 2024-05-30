import java.util.Scanner;
public class examenej1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float sueldo,sueldo_a,sueldo_b,nomina,aumento;
        int wl,n;
        wl=1;nomina=0;
        System.out.print("numero de empleados: ");
        n=teclado.nextInt();
        while (wl<=n) {
            System.out.print("sueldo del empleado: ");
            sueldo=teclado.nextFloat();
            if (sueldo<1000) {
                sueldo_a= (float) (sueldo * 0.15);
                aumento=sueldo+sueldo_a;
                System.out.println("su sueldo es: "+aumento+"el aumento es: "+sueldo_a);
                nomina+=aumento;
                wl+=1;
            }
            else{
                sueldo_b= (float) (sueldo * 0.12);
                aumento=sueldo+sueldo_b;
                System.out.println("su sueldo es: "+aumento+"  el aumento es: "+sueldo_b);
                nomina+=aumento;
                wl+=1;
            }
        }
        System.out.println("la nomina de la empresa es: "+nomina);
    }
    
}