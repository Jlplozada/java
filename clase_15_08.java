import java.util.Scanner;

public class clase_15_08 {
    public Scanner teclado = new Scanner(System.in);
    public int[][] matriz_A, matriz_B, matriz_C;
    public String operacion;

    public void text() {
        System.out.println("Bienvenido");
        System.out.println("");
        System.out.println("El siguiente algoritmo se encargara de crear dos");
        System.out.println("matrices de 3x3 y darte el resultado de sus operaciones.");
    }

    public void ingresarMatrizA() {
        matriz_A = new int[3][3];
        System.out.println("ingresa los valores de la primera matriz 'A': ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("ingrese el valor para la posicion (" + fila + ", " + columna + "): ");
                matriz_A[fila][columna] = teclado.nextInt();
            }
        }
        System.out.println("("+matriz_A[0][0]+")("+matriz_A[0][1]+")("+matriz_A[0][2]+")");
        System.out.println("("+matriz_A[1][0]+")("+matriz_A[1][1]+")("+matriz_A[1][2]+")");
        System.out.println("("+matriz_A[2][0]+")("+matriz_A[2][1]+")("+matriz_A[2][2]+")");
    }

    public void ingresarMatrizB() {
        matriz_B = new int[3][3];
        System.out.println("ingresa los valores de la segunda matriz 'B': ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("ingrese el valor para la posición (" + fila + ", " + columna + "): ");
                matriz_B[fila][columna] = teclado.nextInt();
            }
        }
        System.out.println("("+matriz_B[0][0]+")("+matriz_B[0][1]+")("+matriz_B[0][2]+")");
        System.out.println("("+matriz_B[1][0]+")("+matriz_B[1][1]+")("+matriz_B[1][2]+")");
        System.out.println("("+matriz_B[2][0]+")("+matriz_B[2][1]+")("+matriz_B[2][2]+")");
    }

    public void sumarMatrices() {
        operacion="suma";
        matriz_C = new int[3][3];
        System.out.println("la suma de las matrices 'A' y 'B' es: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matriz_C[fila][columna] = matriz_A[fila][columna] + matriz_B[fila][columna];
            }
        }
        System.out.println("                        ("+matriz_A[0][0]+")"+"("+matriz_A[0][1]+")"+"("+matriz_A[0][2]+")"+"                ("+matriz_B[0][0]+")"+"("+matriz_B[0][1]+")"+"("+matriz_B[0][2]+")");
        System.out.println("la "+operacion+" de la MATRIZ A ("+matriz_A[1][0]+")"+"("+matriz_A[1][1]+")"+"("+matriz_A[1][2]+")"+" con la Matriz B("+matriz_B[1][0]+")"+"("+matriz_B[1][1]+")"+"("+matriz_B[1][2]+")");
        System.out.println("                        ("+matriz_A[2][0]+")"+"("+matriz_A[2][1]+")"+"("+matriz_A[2][2]+")"+"                ("+matriz_B[2][0]+")"+"("+matriz_B[2][1]+")"+"("+matriz_B[2][2]+")");
        System.out.println("("+matriz_C[0][0]+")("+matriz_C[0][1]+")("+matriz_C[0][2]+")");
        System.out.println("("+matriz_C[1][0]+")("+matriz_C[1][1]+")("+matriz_C[1][2]+")");
        System.out.println("("+matriz_C[2][0]+")("+matriz_C[2][1]+")("+matriz_C[2][2]+")");
    }
    public void multiploMatrices(){

    }
    public void restarMatrices() {
        matriz_C = new int[3][3];
        operacion="resta";
        System.out.println("la resta de las matrices 'A' y 'B' es: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matriz_C[fila][columna] = matriz_A[fila][columna] - matriz_B[fila][columna];
            }
        }
        System.out.println("                        ("+matriz_A[0][0]+")"+"("+matriz_A[0][1]+")"+"("+matriz_A[0][2]+")"+"                ("+matriz_B[0][0]+")"+"("+matriz_B[0][1]+")"+"("+matriz_B[0][2]+")");
        System.out.println("la "+operacion+" de la MATRIZ A ("+matriz_A[1][0]+")"+"("+matriz_A[1][1]+")"+"("+matriz_A[1][2]+")"+" con la Matriz B("+matriz_B[1][0]+")"+"("+matriz_B[1][1]+")"+"("+matriz_B[1][2]+")");
        System.out.println("                        ("+matriz_A[2][0]+")"+"("+matriz_A[2][1]+")"+"("+matriz_A[2][2]+")"+"                ("+matriz_B[2][0]+")"+"("+matriz_B[2][1]+")"+"("+matriz_B[2][2]+")");
        System.out.println("("+matriz_C[0][0]+")("+matriz_C[0][1]+")("+matriz_C[0][2]+")");
        System.out.println("("+matriz_C[1][0]+")("+matriz_C[1][1]+")("+matriz_C[1][2]+")");
        System.out.println("("+matriz_C[2][0]+")("+matriz_C[2][1]+")("+matriz_C[2][2]+")");
    }
    public void multiplicacionMatrices() {
        matriz_C = new int[3][3];
        operacion="resta";
        System.out.println("la resta de las matrices 'A' y 'B' es: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matriz_C[fila][columna] = matriz_A[fila][columna] * matriz_B[fila][columna];
            }
        }
        System.out.println("                        ("+matriz_A[0][0]+")"+"("+matriz_A[0][1]+")"+"("+matriz_A[0][2]+")"+"                ("+matriz_B[0][0]+")"+"("+matriz_B[0][1]+")"+"("+matriz_B[0][2]+")");
        System.out.println("la "+operacion+" de la MATRIZ A ("+matriz_A[1][0]+")"+"("+matriz_A[1][1]+")"+"("+matriz_A[1][2]+")"+" con la Matriz B("+matriz_B[1][0]+")"+"("+matriz_B[1][1]+")"+"("+matriz_B[1][2]+")");
        System.out.println("                        ("+matriz_A[2][0]+")"+"("+matriz_A[2][1]+")"+"("+matriz_A[2][2]+")"+"                ("+matriz_B[2][0]+")"+"("+matriz_B[2][1]+")"+"("+matriz_B[2][2]+")");
        System.out.println("("+matriz_C[0][0]+")("+matriz_C[0][1]+")("+matriz_C[0][2]+")");
        System.out.println("("+matriz_C[1][0]+")("+matriz_C[1][1]+")("+matriz_C[1][2]+")");
        System.out.println("("+matriz_C[2][0]+")("+matriz_C[2][1]+")("+matriz_C[2][2]+")");
    }
    public void divicionMatrices() {
        matriz_C = new int[3][3];
        operacion="resta";
        System.out.println("la resta de las matrices 'A' y 'B' es: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matriz_C[fila][columna] = matriz_A[fila][columna] / matriz_B[fila][columna];
            }
        }
        System.out.println("                        ("+matriz_A[0][0]+")"+"("+matriz_A[0][1]+")"+"("+matriz_A[0][2]+")"+"                ("+matriz_B[0][0]+")"+"("+matriz_B[0][1]+")"+"("+matriz_B[0][2]+")");
        System.out.println("la "+operacion+" de la MATRIZ A ("+matriz_A[1][0]+")"+"("+matriz_A[1][1]+")"+"("+matriz_A[1][2]+")"+" con la Matriz B("+matriz_B[1][0]+")"+"("+matriz_B[1][1]+")"+"("+matriz_B[1][2]+")");
        System.out.println("                        ("+matriz_A[2][0]+")"+"("+matriz_A[2][1]+")"+"("+matriz_A[2][2]+")"+"                ("+matriz_B[2][0]+")"+"("+matriz_B[2][1]+")"+"("+matriz_B[2][2]+")");
        System.out.println("("+matriz_C[0][0]+")("+matriz_C[0][1]+")("+matriz_C[0][2]+")");
        System.out.println("("+matriz_C[1][0]+")("+matriz_C[1][1]+")("+matriz_C[1][2]+")");
        System.out.println("("+matriz_C[2][0]+")("+matriz_C[2][1]+")("+matriz_C[2][2]+")");
    }
    
    public static void main(String[] args) {
        clase_15_08 matriz = new clase_15_08();
        matriz.text();
        matriz.ingresarMatrizA();
        matriz.ingresarMatrizB();
        matriz.sumarMatrices();
        matriz.restarMatrices();
        matriz.multiplicacionMatrices();
        matriz.divicionMatrices();
    }
}