// En un restaurante se desea calcular el total a pagar de cada cliente, incluyendo el costo de la comida, las bebidas adicionales y 
// la propina.El programa debe pedir el número total de clientes que ingresaron y para cada cliente solicitar el costo de la comida y 
// si se desea el costo de las bebidas adicionales. 
// Finalmente solicitar el porcentaje de la propina deseado, calcular y mostrar el monto de la propina y el total a pagar.
import java.util.Scanner;
public class eje2_14_06 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int f,clientes,ncuenta,fb;
        float comida,bebida,propina,total;
        comida=0;bebida=0;propina=0;clientes=0;ncuenta=0;fb=0;
        System.out.print("Numero total de clientes: ");
        clientes=teclado.nextInt();
        for(f=1;f<=clientes;f++){
            System.out.print("numero de cuenta: #");
            ncuenta=teclado.nextInt();
            System.out.println("bebidas extra");
            System.out.println("1.si  /  2.no");
            fb=teclado.nextInt();
            if (fb==1) {
                System.out.println("costo de comida");
                comida=teclado.nextFloat();
                System.out.println("costo en bebidas");
                bebida=teclado.nextFloat();
                System.out.println("costo propina");
                propina=teclado.nextFloat();
                
            if (bebida==0) {
                total=comida+bebida+propina;
                System.out.println("________________________________________________");
                System.out.println("");
                System.out.println("numero de cuenta: "+ncuenta);
                System.out.println("costo comida: "+comida);
                System.out.println("propina: "+propina);
                System.out.println("total a pagar: "+total);
                System.out.println(" ");
                System.out.println("________________________________________________");
            }
            else{
                total=comida+bebida+propina;
                System.out.println("________________________________________________");
                System.out.println("");
                System.out.println("numero de cuenta: "+ncuenta);
                System.out.println("costo comida: "+comida);
                System.out.println("costo bebida adicional: "+bebida);
                System.out.println("propina: "+propina);
                System.out.println("total a pagar: "+total);
                System.out.println(" ");
                System.out.println("________________________________________________");
            }
            } else {
                System.out.println("costo de comida");
                comida=teclado.nextFloat();
                System.out.println("costo propina");
                propina=teclado.nextFloat();
                bebida=0;
                
            if (bebida==0) {
                total=comida+bebida+propina;
                System.out.println("________________________________________________");
                System.out.println("");
                System.out.println("numero de cuenta: "+ncuenta);
                System.out.println("costo comida: "+comida);
                System.out.println("propina: "+propina);
                System.out.println("total a pagar: "+total);
                System.out.println(" ");
                System.out.println("________________________________________________");
            }
            else{
                total=comida+bebida+propina;
                System.out.println("________________________________________________");
                System.out.println("");
                System.out.println("numero de cuenta: "+ncuenta);
                System.out.println("costo comida: "+comida);
                System.out.println("costo bebida adicional: "+bebida);
                System.out.println("propina: "+propina);
                System.out.println("total a pagar: "+total);
                System.out.println(" ");
                System.out.println("________________________________________________");
            }
            }
        }
    }
}
