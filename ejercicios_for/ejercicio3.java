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
        int f,n,equilatero,isoseles,escaleno;
        n=0;equilatero=0;isoseles=0;escaleno=0;
        float lado_a,lado_b,lado_c;
        for (f=1;f<=n;f++){
            System.out.print("Lado_a: ");
            lado_a=teclado.nextFloat();
            System.out.print("Lado_b: ");
            lado_b=teclado.nextFloat();
            System.out.print("Lado_c: ");
            lado_c=teclado.nextFloat();
            if (lado_a==lado_b && lado_c==lado_b && lado_a==lado_c) {
                System.out.println("triangulo equilatero");
                equilatero+=1;
            
            }
            if (lado_a==lado_b||lado_a ==lado_c||lado_c==lado_b) {
                System.out.println("triangulo isoseles");
                isoseles+=1;
            }
            else{
                System.out.println("triangulo escaleno");
                escaleno+=1;
            }
        }
        System.out.println("la cantidad de triangulo equilatero es: "+equilatero);
        System.out.println("la cantidad de triangulos isoseles es: "+isoseles);
        System.out.println("la cantidad de triangulo escalenmo es: "+escaleno);
       
    }
}


