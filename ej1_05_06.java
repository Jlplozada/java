import java.util.Scanner;
public class ej1_05_06 {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int wl,men,ls,wl2,num;
    wl=1;wl2=1;num=0;
    while (wl==1) {
    System.out.println("1.para comenzar");
    System.out.println("2.lista de numeros");
    System.out.println("3.terminar"); 
    men=teclado.nextInt(); 
    if (men==2) {
        System.out.print("ingrese hasta que numero va la lista: ");
        ls=teclado.nextInt();
        while (wl2<=ls) {
            wl2+=1;
            num+=1;
            System.out.print(num+",");
            System.out.println(" ");
        }
    }
    if (men==3) {
        wl=2;
    }     
    else{
        System.out.println("Dato no valido");
    } 
    }
  }  
}
