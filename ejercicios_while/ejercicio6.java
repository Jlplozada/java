package ejercicios_while;
import java.util.Scanner;
// Desarrollar un programa que permita cargar n números enteros y luego 
// nos informe cuántos valores fueron pares y cuántos impares.
// Emplear el operador % en la condición de la estructura condicional:
// 	if (valor%2==0)     Si el if da verdadero luego es par

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,wl,numeros,par,impar;
        wl=1;par=0;impar=0;
        System.out.print("Cantidad de numeros: ");
        n=teclado.nextInt();
        while (wl<=n) {
            wl+=1;
            System.out.print("ingrese numero: ");
            numeros=teclado.nextInt();
            if (numeros%2==0) {
                par+=numeros;

            }
            else{
                impar+=numeros;
            }
            System.out.print("los numeros ipares son: "+impar);
            System.out.print("los pares son: "+par);
   
        }
    }
    
}
