import java.util.Scanner;
public class whilefor_12_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int wl,f,n,men,c;
        wl=1;n=0;c=0;
        while (wl==1) {
            System.out.println("1 para ingresar conteo");
            System.out.println("2 para finalisar conteo");
            System.out.print("#");
            men=teclado.nextInt();
            if (men==2) {
                     wl=2;
            }
            else{
                System.out.println("ingrese hasta quie numero se contara");
                System.out.print("#");
                n=teclado.nextInt();
                for(f=0;f<=n;f++){
                  System.out.println(f);
                }
            }
            
        }
        System.out.println("tarea finalizada");

    }
}