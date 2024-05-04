import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        int cantidad = 0;

        while (cantidad >= 10) {
            cantidad= + 1;
            System.out.print("Ingrese numero");
            valor = teclado.nextInt();
        }
    }
}
