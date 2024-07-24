import java.util.Scanner;
public class ej1_08_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int wl,cal,usu,prom,mal,bien,not;
        float tprom;
        wl=1;usu=0;prom=0;mal=0;bien=0;
        while (wl==1) {
            System.out.println("ingrese una calificacion de 1 a 5");
            System.out.println("ingrese 0 para terminar");
            cal=teclado.nextInt();
           if (cal==0) {
            wl=2;
           }
           else{
            if (cal>=1 && cal<3) {
                System.out.println("mal");
                mal+=1;
                prom+=cal;   
            }
            else{
                if (cal>=3 && cal<=5) {
                    System.out.println("bien");
                    bien+=1;
                    prom+=cal;
                }
                else{
                    System.out.println("error");
                }
            }
           }
        }
        usu=mal+bien;
        tprom=prom/usu;
        System.out.println("notas malas= "+mal);
        System.out.println("notas buenas= "+bien);
        System.out.println("promedio= "+tprom);
    }
}
