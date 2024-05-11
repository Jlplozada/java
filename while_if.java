import java.util.Scanner;
public class while_if {
        public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int empleado_a,empleado_b,wl;
        float sueldo,importe;
        empleado_a=0;empleado_b=0;sueldo=0;wl=1;
        while (wl>2) {
            System.out.println("¿sueldo es de?");
            System.out.print("$ ");
            sueldo=teclado.nextFloat();
            if ( 301<sueldo && sueldo<500) {
                System.out.println("sueldo A");
                empleado_a+=1;
                importe+=sueldo;
                wl=-1;
            }
            else if (100<sueldo&&sueldo<300) {
                System.out.println("sueldo b");
                empleado_b+=1;
                importe+=sueldo;
                wl=-1;
            }
            else{
                wl+=1;
            }
            wl+1;
        }
        System.out.println("empleados que ganan entre 300 y 500: "+empleado_a);
        System.out.println("empleados que ganan entre 100 y 300: "+empleado_b);
        System.out.println("el importe de la empresa es: "+importe);
    }
}
