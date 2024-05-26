package ejercicios_for;
import java.util.Scanner;
// 3.	Realizar un programa que lea los lados de n triángulos, e informar:
// a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
//  isósceles (dos lados iguales), o escaleno (ningún lado igual)
// b) Cantidad de triángulos de cada tipo.
// c) Tipo de triángulo que posee menor cantidad.

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int f,n;
        n=0;
        float lado_a,lado_b,lado_c;
        for (f=1;f<=n;f++){
            System.out.print("Lado_a: ");
            lado_a=teclado.nextFloat();
            System.out.print("Lado_b: ");
            lado_b=teclado.nextFloat();
            System.out.print("Lado_c: ");
            lado_c=teclado.nextFloat();
            if (lado_a==lado_b) {
                if (lado_b==lado_c) {
                    System.out.println("los tres lados son iguales");
                }
                if (lado_c==lado_a) {
                    
                }
                if (lado_b==lado_a) {
                    
                }
            }
            if (lado_b==lado_c) {
                
            }
            else{
                
            }
        }
    }
}


