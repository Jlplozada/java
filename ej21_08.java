import java.util.Scanner;
import java.util.Random;

public class ej21_08 {
    public Scanner teclado=new Scanner(System.in);
    public Random Nx = new Random();
    public int numero;
    public int[][] partida;
    public int[] usuario;
    public int[] Rnumero;
    public void text(){
        System.out.println("bienbenido");
        System.out.println("el siguiente algoritmo se basa en un juego");
        System.out.println(" de puedra papel o tijera usando como base la libreria");
        System.out.println("random para tener una respuesta aleatoria y divertirse mas");
        System.out.println("espero lo disfrutes");System.out.println();System.out.println();
    }
    public void partida() {
        System.out.println("ingresa tus mmovimientos:");
        System.out.println("#0   piedra");
        System.out.println("#1   papel");
        System.out.println("#2   tijeras");
        Rnumero=new int[3];
        for(int r=0;r<3;r++){
            Rnumero[r]=Nx.nextInt(3);
        }
        for(int u=0;u<3;u++){
           usuario[u]=teclado.nextInt();
        }
        
    }

    public static void main(String[] args) {
        ej21_08 ppt=new ej21_08();
        ppt.text();
        ppt.partida();
    }    
}