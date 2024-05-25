package ejercicios_for;
import java.util.Scanner;

//Escribir un programa que lea n números enteros y 
// calcule la cantidad de valores mayores o iguales a 1000.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,f,valor,may;
        n=0;may=0;
        System.out.print("cuantas veces se repetira: ");
        n=teclado.nextInt();
        for(f=1;f<=n;f++){
            System.out.println("ingrese valor: ");
            valor=teclado.nextInt();
            if (valor>=1000) {
                may+=1;
            }
        }
        System.out.println("la cantidad de valores mayor o igual a mil es: "+may);
    }
}
