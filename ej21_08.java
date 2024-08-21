import java.util.Scanner;
import java.util.Random;

public class ej21_08 {
    public Scanner teclado = new Scanner(System.in);
    public Random Nx = new Random();
    public int numero;
    public int[][] partida;
    public int[] usuario;
    public int[] Rnumero;

    public void text() {
        System.out.println("bienbenido");
        System.out.println("el siguiente algoritmo se basa en un juego");
        System.out.println("de piedra papel o tijera usando como base la libreria");
        System.out.println("random para tener una respuesta aleatoria y divertirse más");
        System.out.println("espero lo disfrutes");
        System.out.println();
        System.out.println();
    }
    public void partida() {
        partida=new int[2][3];
        usuario=new int[3];
        Rnumero=new int[3];
        System.out.println("ingresa tus movimientos:");
        System.out.println("#0   piedra");
        System.out.println("#1   papel");
        System.out.println("#2   tijeras");
        for (int r = 0; r < 3; r++) {
            Rnumero[r] = Nx.nextInt(3);
        }
        for (int u = 0; u < 3; u++) {
            usuario[u] = teclado.nextInt();
        }
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (fila == 0) { 
                    // fila sumerior es usuario
                    partida[fila][columna] = usuario[columna];
                } else {
                    partida[fila][columna] = Rnumero[columna];
                }
            }
        }
        System.out.println("Partidas:");
        System.out.println("");
        System.out.println("usuario");
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(partida[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println("maquina");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (partida[0][i] == partida[1][i]) {
                System.out.println("ronda " + (i + 1) + ": Es un empate.");
            } else {
                if (partida[0][i] == 0) { //piedra
                    if (partida[1][i] == 2) { //tijeras
                        System.out.println("ronda " + (i + 1) + ": ganaste piedra vence a tijeras.");
                    } else { //papel
                        System.out.println("ronda " + (i + 1) + ": perdiste papel vence a piedra.");
                    }
                } else {
                    if (partida[0][i] == 1) { //papel
                        if (partida[1][i] == 0) { //piedra
                            System.out.println("ronda " + (i + 1) + ": ganaste papel vence a piedra.");
                        } else { //tijeras
                            System.out.println("ronda " + (i + 1) + ": perdiste tijeras vence a papel.");
                        }
                    } else { //tijeras
                        if (partida[1][i] == 1) { // Papel
                            System.out.println("ronda " + (i + 1) + ": ganaste tijeras vence a papel.");
                        } else { //piedra
                            System.out.println("ronda " + (i + 1) + ": gerdiste piedra vece a tijeras.");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ej21_08 ppt = new ej21_08();
        ppt.text();
        ppt.partida();
    }
}
