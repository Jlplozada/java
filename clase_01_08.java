import java.util.Scanner;

public class clase_01_08 {
    public int[] vec;
    public Scanner teclado=new Scanner(System.in);
    public String[] salon={"A","B","C","D","E"};
    public void text(){
        System.out.println("            bienvenido");
        System.out.println("el siguiente algoritmo te dira cual de los 5 salones");
        System.out.println("tiene mas estudiantes");
    }
    public void salon(){
        vec=new int[5];
        for(int f=0;f<5;f++){
            System.err.println("ingrese la cantidad de alumnos");
            System.out.println("en la aula "+salon[f]);
            System.out.print("#");
            vec[f] = teclado.nextInt();
        }    
    }
    public void salonmayor() {
        int mayor = vec[0];
        String salonMayor = salon[0];
        
        for (int f = 1; f < vec.length; f++) {
            if (vec[f] > mayor) {
                mayor = vec[f];
                salonMayor = salon[f];
            }
        }
        
        System.out.println("El salón con más estudiantes es el salón " + salonMayor + " con " + mayor + " estudiantes.");
    }
    public void pantalla(){
        System.out.print("\033[H\033[2J");
    }
    public void pausa(){
        try{
            Thread.sleep(10*1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
        public static void main(String[] args) {
        clase_01_08 min=new clase_01_08();
        min.pantalla();
        min.text();
        min.pausa();
        min.pantalla();
        min.salon();
        min.salonmayor();
    }
    
}
