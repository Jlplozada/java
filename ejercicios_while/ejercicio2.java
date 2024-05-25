package ejercicios_while;
import java.util.Scanner;
// 2.En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
// realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
// empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además, 
// el programa deberá informar el importe que gasta la empresa en sueldos al personal.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,wl,sueldo_a,sueldo_b;
        float sueldo,importe;
        wl=1;sueldo_a=0;sueldo_b=0;importe=0;
        System.out.print("cuantos empleados son: ");
        n=teclado.nextInt();
        while (wl<=n) {
            System.out.print("cuanto gana el empleado: ");
            sueldo=teclado.nextFloat();
            importe+=sueldo;
            wl+=1;
            if (sueldo>300) {
                sueldo_b+=1;
            }
            else{
                sueldo_a+=1;
            }
        }
        System.out.println("los usuarios que ganan menos de 300 son: "+sueldo_a);
        System.out.println("los usuarios que ganan mas de 300 son: "+sueldo_b);
        System.out.println("el importe de la empresa es: "+importe);
    }
}
