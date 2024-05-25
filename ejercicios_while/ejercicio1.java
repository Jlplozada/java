package ejercicios_while;
import java.util.Scanner;
// 1.Desarrollar un programa que permita la carga de 10 valores por teclado 
// y nos muestre posteriormente la suma de los valores ingresados y su promedio.
public class ejercicio1 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int datos,wl,suma;
        suma=0;
        wl=1;
        while (wl<=10) {
            wl+=1;
            System.out.print("ingrese valor: ");
            suma+=teclado.nextInt();         
        }
        System.out.println("la sumatoria de los valores es: "+ suma);
    }
}