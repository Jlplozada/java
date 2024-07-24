import java.util.Scanner;
public class eje3_14_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int vocal,wl,lt,cont,la,le,li,lo,lu;
        String letra; 
        char a,e,i,o,u;
        la=0;le=0;li=0;lo=0;lu=0;
        wl=1;vocal=0;lt=0;cont=11;
        do{
            wl+=1;
            cont--;
            System.out.print("ingrese "+cont+" letras minusculas: ");
            letra=teclado.nextLine();
            if (letra.equals("a")||letra.equals("e") ||letra.equals("i") || letra.equals("o")||letra.equals("u")) {
                vocal++;
                if (letra.equals("a")) {
                    la++;
                } else {
                    if (letra.equals("e")) {
                        le++;
                    } else {
                        if (letra.equals("i")) {
                            li++;
                        } else {
                            if (letra.equals("o")) {
                                lo++;
                            } else {
                                lu++;
                            }
                        }
                    }
                }
            } else {
               System.out.println("...");
               lt++;
            }
        } while (wl<=10);
        System.out.println("");
        System.out.println("___________________________________________");
        System.out.println("el numero de vocales es: "+vocal);
        System.out.println("letras: "+lt);
        System.out.println("a: "+la);
        System.out.println("e: "+le);
        System.out.println("i: "+li);
        System.out.println("o: "+lo);
        System.out.println("u: "+lu);
    }
}
