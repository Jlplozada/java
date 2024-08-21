import java.util.Scanner;
public class clase2_27_07 {
    private Scanner teclado=new Scanner(System.in);
    public int npersonas;
    public String[] nombre;
    public int[] edad;
    public void txt(){
        System.out.println("          Bienvenido");
        System.out.println("el siguiente algoritmo tomara una cantidad de nombres y edades");
        System.out.println("y te dara una lista de mayores y menores de edad");
    }
    public void ndatos(){
        System.out.println("ingresa la cantidad de personas que usaras en el algoritmo");
        System.out.print("# ");
        npersonas=teclado.nextInt();
    }
    public void carga(){
        nombre=new String[npersonas];
        edad=new int[npersonas];
        for(int f=0;f<npersonas;f++){
            System.err.print("ingresa el nombre: ");
            nombre[f]=teclado.next();
            System.out.println();
            System.err.print("ingresa la edad: ");
            edad[f]=teclado.nextInt();
            System.out.println("");
        }
    }
    public void mayores(){
        for(int f=0;f<npersonas;f++){
            if (edad[f]>=18) {
                System.out.println(nombre[f]+" es mayor de edad y tiene "+edad[f]+" años");
            }else{
                
            }
        }
    }
    public void menores(){
        System.out.println();
        System.out.println();
        for(int f=0;f<npersonas;f++){
            if (edad[f]<18) {
                System.out.println(nombre[f]+" es menor de edad y tiene "+edad[f]+" años");
            }else{
                
            }
        }
    }
    public void pantalla(){
        System.out.print("\033[H\033[2J");
    }
    public void pausa(){
        try{
            Thread.sleep(2*1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        clase2_27_07 paralelo=new clase2_27_07();
        paralelo.pantalla();
        paralelo.txt();
        paralelo.pausa();
        paralelo.pantalla();
        paralelo.ndatos();
        paralelo.pantalla();
        paralelo.carga();
        paralelo.pantalla();
        paralelo.mayores();
        paralelo.menores();
    }
    
}
