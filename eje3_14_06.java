import java.util.Scanner;
public class eje3_14_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vocal,wl,lt;
        String letra; 
        char a,e,i,o,u;
        wl=1;vocal=0;lt=0;
        do{
            wl+=1;
            System.out.print("ingrese letra: ");
            letra=teclado.nextLine();
            if (letra.equals("a")||letra.equals("e") ||letra.equals("i") || letra.equals("o")||letra.equals("u")) {
                vocal++;
            } else {
               System.out.println("...");
               lt++;
            }
        } while (wl<=10);
        System.out.println("el numero de vocales es: "+vocal);
        System.out.println("letras: "+lt);
    }
}
