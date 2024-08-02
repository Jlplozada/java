import java.util.Scanner;
public class clase_27_07 {
    public Scanner teclado=new Scanner(System.in);
    public int nprod=0,wl=0;
    public String desc;
    public double tcartera,tcosto,pagar;
    public double[] vprod;
    public int list=0;
    public void txt1(){
        System.out.println("        bienvenido a la tienda        ");
        System.out.println("");
        System.out.println("por favor indique la cantidad de productos que");
        System.out.println("          decea adquirir.");
        System.out.print("# ");
        nprod=teclado.nextInt();
    }
    public void productos(){
        vprod=new double[nprod];
        System.out.println("ingrese valor del producto");
        for(int f=0;f<nprod;f++){
            System.out.println("");
            System.out.print("$ ");
            vprod[f]=teclado.nextDouble();
        }
    }
    public void listado(){
        for(int f=0;f<nprod;f++){
            list++;
            System.out.println("-el producto "+list+" tiene un costo de $ "+vprod[f]);
            tcosto+=vprod[f];
        }
        System.out.println("un total de $"+tcosto);
    }
    public void mpago(){
        do {
            System.out.println("          metodo de pago");
            System.out.println("1. efectivo  10% de descuento");
            System.out.println("2. tarjeta 30% de descuento");
            System.out.println("3. pse 20% de descuento");
            System.out.print("# ");
            tcartera=teclado.nextInt();
            
            if (tcartera==1) {
                pagar=tcosto*0.1;
                desc="10%";
                wl=1;
            } else {
                if (tcartera==2) {
                    desc="30%";
                    pagar=tcosto*0.3;     
                    wl=1;               
                } else {
                    if (tcartera==3) {
                        desc="20%";
                        pagar=tcosto*0.2;
                        wl=1;
                    } else {
                        System.out.println("no es metodo de pago");
                    }
                }
            }
        } while (wl==0);
    }
    public void factura(){
        System.out.println("factura");System.out.println();
        for(int f=0;f<nprod;f++){
            list++;
            System.out.println("- #"+list+" con valor de $ "+vprod[f]);
            tcosto+=vprod[f];
        }
        System.out.println("");
        System.out.println("y un descuento de "+desc);System.out.println();
        System.out.println("Total a pagar: $"+pagar);
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
        clase_27_07 cartera=new clase_27_07();
        int bd=0;
        do {
            cartera.pantalla();
            cartera.txt1();
            cartera.pantalla();
            cartera.productos();
            cartera.pantalla();
            cartera.listado();
            cartera.pausa();
            cartera.pantalla();
            cartera.mpago();
            cartera.pantalla();
            cartera.factura();    
            cartera.pausa();
            cartera.pantalla();
        } while (bd==0);
        
    }
}
