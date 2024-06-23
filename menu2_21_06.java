import java.util.Scanner;

import javax.print.event.PrintEvent;
public class menu2_21_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int wl=1,wlmenu=1,menu,wlfact=1;
        // precios__________________________________-
        float P_Cir,P_Pel,P_Bañ,P_Pur,P_Col;
        float TP_Cir,TP_Pel,TP_Bañ,TP_Pur,TP_Col,Tot;
        P_Cir=200000; //Cirugia
        P_Pel=30000; //Peluqueria
        P_Bañ=20000; //Baño
        P_Pur=35000; //Purga
        P_Col=20000; //Collar
        // _________________________________________-
        int Cir=0,Pel=0,Bañ=0,Pur=0,Col=0;
             System.out.println("  //''\\\\");
            System.out.println(" //* * \\\\ ");
            System.out.println("(/(_v_) \\)");
            System.out.println("  / '* '\\  ");
            System.out.println(" (/_)^(_\\)");
            System.out.println("Bienvenido a la veterinaria");
        do {
            System.out.println("¿Cual servicio deceas adquirir?");            
            System.out.println("1.Cirugia");
            System.out.println("2.Peluqueria");
            System.out.println("3.Baño");
            System.out.println("4.Purga");
            System.out.println("5.Collar");
            System.out.println("0.salir");
            System.out.print("# ");
            menu=teclado.nextInt();
            if (menu==1) {
                Cir++;
                System.out.println("Costo de: $"+P_Cir);
            } else {
                if (menu==2) {
                    Pel++;
                    System.out.println("Costo de: $"+P_Pel);

                } else {
                    if (menu==3) {
                        Bañ++;
                        System.out.println("Costo de: $"+P_Bañ);
                        
                    } else {
                        if (menu==4) {
                            Pur++;
                            System.out.println("Costo de: $"+P_Pur);
                            
                        } else {
                            if (menu==5) {
                                Col++;
                                System.out.println("Costo de: $"+P_Col);
                                
                            } else {
                                if (menu==0) {
                                    wlmenu=0;
                                } else {
                                    System.out.println("error dato no valido");
                                }
                            }
                        }
                    }
                }
            }
        } while (wl==wlmenu);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("_____________________");
        TP_Cir=P_Cir*Cir;
        TP_Pel=P_Pel*Pel;
        TP_Bañ=P_Bañ*Bañ;
        TP_Pur=P_Pur*Pur;
        TP_Col=P_Col*Col;
        Tot=TP_Cir+TP_Pel+TP_Bañ+TP_Pur+TP_Col;
        System.out.println(" ");
        System.out.println("EL total a pagar es: $ "+Tot);
        System.out.println( );
        System.out.println("Detalles de factura");
        do {
            wlfact++;
            if (TP_Cir>0) {
                System.out.println("El costo total en cirugia es: $"+ TP_Cir);
                TP_Cir=0;
            } else {
                if (TP_Pel>0) {
                    System.out.println("El precio total en cortes de pelo es: $"+TP_Pel);
                    TP_Pel=0;
                } else {
                    if (TP_Bañ>0) {
                        System.out.println("El precio total en Baños es de: $"+TP_Bañ);
                        TP_Bañ=0;
                    } else {
                        if (TP_Pur>0) {
                            System.out.println("El precio total en purgas es de: $"+TP_Pur);
                            TP_Pur=0;
                        } else {
                            if (TP_Col>0) {
                                System.out.println("El Precio total de collares es: $"+TP_Col);
                                TP_Col=0;
                            } else {
                            
                            }
                        }
                    }
                }
            }
        } while (wlfact<=6);
    }
}
