import java.util.Scanner;
public class ej1_1_jun {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // este int son contadores de los ciclos o contadors logicos
        int wl,m1,rp;
        // este int acumula los clients y los productos
        int num_clientes,n_productos;
        // este float acumula los costos y cantidades numericas tipo moneda
        float val_compra,tot_compra,nomina,p_producto;
        // le doy el valor 1 al while y 0 a los acumulables de moneda
        wl=1;num_clientes=0;val_compra=1;tot_compra=0;nomina=0;
        while (wl==1) {
            // el while se cumple mientras su valor absoluto sea 1
            System.out.println("1.ingresar cliente nuevo");
            System.out.println("2.terminar dia");
            m1=teclado.nextInt();
            // el if se cumple cuando su valor absoluto es 1 de lo contrario el else cambia el while a 2 cerrando el bucle
            if (m1==1) {
                // acomulante de cliente
                num_clientes+=1;
                System.out.println("ingrese cantidad de productos");
                n_productos=teclado.nextInt();
                // pregunta cuantos productos son y se reptira la cantidad de productos  acomulando su costo
                while (val_compra<=n_productos) {
                    System.out.print("ingrese valor del producto:");
                    p_producto=teclado.nextFloat();
                    // suma los valores de producto
                    tot_compra+=p_producto;
                    // suma 1 al contador del while para parar cuando se cumpla la cantidad de productos pedidos con anterioridad
                    val_compra+=1;
                    // suma el costo total a la nomina diaria
                    nomina+=tot_compra;
                }
                // imprime el valor total de compra
                System.out.println("el valor de la compra es: "+tot_compra);
                // reinicia los contadores de while y de total de compra
                tot_compra=0;
                val_compra=1;
            }
            else{
                // este cierra el bucle de clientes
                wl+=2;
            }
        }     
        // imrpime el numero de clientes y la nomina
        System.out.println("numero de clientes: "+num_clientes);
        System.out.println("total nomina: "+nomina);
    }
}
