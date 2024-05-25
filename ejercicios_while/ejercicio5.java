package ejercicios_while;
import java.util.Scanner;
// 5. Escribir un programa que solicite ingresar 10 notas de alumnos
// y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int wl,nota_a,nota_b;
        float nota;
        wl=1;nota_a=0;nota_b=0;
        while (wl<=10) {
            wl+=1;
            System.out.print("ingrese nota: ");
            nota=teclado.nextFloat();
            if (nota>=7) {
                nota_a+=1;  
            }
            else{
                nota_b+=1;
            }
        }
        System.out.println("el numero de estudiates con notas mayores o iguales a 7 son: "+nota_a);
        System.out.println("el numero de estudiates con notas menores a 7 son: "+nota_b);
    }
}
