package ejercicios_for;
import java.util.Scanner;
// 2.	programa que lea n pares de datos, cada par de datos corresponde a la 
// medida de la base y la altura de un triángulo. El programa deberá informar:
// a) De cada triángulo la medida de su base, su altura y su superficie.
// b) La cantidad de triángulos cuya superficie es mayor a 12.

public class ejercicio2 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int n,f;
    float altura,base,superficie;
    n=0;superficie=0;
    System.out.print("numero de triangulos: ");
    n=teclado.nextInt();
    for(f=1;f<=n;f++){
        System.out.println("ingrese datos de altura: ");
        altura=teclado.nextInt();
        System.out.println("ingrese datos de base: ");
        base=teclado.nextInt();
        System.out.println("base es: "+base+" altura: "+altura+" superficie: "+base*altura/2);
        if (base*altura/2>12) {
            superficie+=1;
        }
    }
    System.out.println("la cantidad de superfiies mayor a 12 es: "+superficie);
    }
    
}

