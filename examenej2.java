import java.util.Scanner;
public class examenej2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,f,m,t;
        m=0;t=0;
        System.out.print("cantidad de multiplos: ");
        n=teclado.nextInt();
        for(f=1;f<=n;f++){
            m+=3;
            t+=m;
            System.out.print(m+"-");
        }
        System.out.println("cantidad de repeticiones: "+n);
        System.out.println("suma total: "+t);
    }
    
}