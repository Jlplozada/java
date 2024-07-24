import java.util.Scanner;
public class pizza {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // precios de las pizzas ______________________________________________________
        float P_Pep,P_Haw,P_Car,P_Pol,P_Esp,TP_Pep=0,TP_Haw=0,TP_Car=0,TP_Pol=0,TP_Esp=0,Tot_p=0;
        P_Pep=5000;
        P_Haw=5500;
        P_Car=5800;
        P_Pol=5700;
        P_Esp=6000;
        // ______________________________________________________________________________
        int wl,wlmenu,menu,Pep=0,Haw=0,Car=0,Pol=0,Esp=0;
        wl=1;wlmenu=1;
        do {
            System.out.println("1.Pizza De PEPERONI = $"+P_Pep);
            System.out.println("2.Pizza HAWAIANA = $"+P_Haw);
            System.out.println("3.Pizza De CARNE = $"+P_Car);
            System.out.println("4.Pizza De POLLO = $"+P_Pol);
            System.out.println("5.Pizza ESPECIAL = $"+P_Esp);
            System.out.println("0.Terminar Orden");
            System.out.println("Ingrese el numero de la pizza que decea");
            System.out.print("#");
            menu=teclado.nextInt();
            if (menu==1) {
                Pep++;
            } else {
                if (menu==2) {
                    Haw++;
                } else {
                    if (menu==3) {
                        Car++;
                    } else {
                        if (menu==4) {
                            Pol++;
                        } else {
                            if (menu==5) {
                                Esp++;
                            } else {
                                if (menu==0) {
                                    wlmenu=0;
                                }else{
                                    System.out.println("Error dato no encontrado");
                                }
                            }
                        }
                    }
                }
            }
        } while (wl==wlmenu);
        System.out.println("Usted Ordeno "+Pep+" Pizzas De PEPERONI= $ "+(TP_Pep=P_Pep*Pep));
        System.out.println("Usted Ordeno "+Haw+" Pizzas HAWAIANA= $ "+(TP_Haw=P_Haw*Haw));
        System.out.println("Usted Ordeno "+Car+" Pizzas De CARNE= $ "+(TP_Car=P_Car*Car));
        System.out.println("Usted Ordeno "+Pol+" Pizzas De POLLO= $ "+(TP_Pol=P_Pol*Pol));
        System.out.println("Usted Ordeno "+Esp+" Pizzas ESPECIAL= $ "+(TP_Esp=P_Esp*Esp));
        System.out.println("El total a pagar es= "+(Tot_p=TP_Pep+TP_Haw+TP_Car+TP_Pol+TP_Esp));
    }
}
