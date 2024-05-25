package ejercicios_while;
import java.util.Scanner;
// 4. Se ingresan un conjunto de n alturas de personas por 
// teclado. Mostrar la altura promedio de las personas.

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float alt,prom,promalt;
        int n,wl;
        wl=1;n=0;prom=0;
        System.out.print("numero de personas: ");
        n=teclado.nextInt();
        while (wl<=n) {
            wl+=1;
            System.out.print("Cual es la altura: ");
            alt=teclado.nextFloat();
            prom+=alt;
        }
        promalt=prom/n;
        System.out.println("se tomaron "+n+" alturas");
        System.out.println("el promedio de alturas es "+promalt);
    }
}
