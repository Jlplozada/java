

import java.util.Scanner;
public class eje1_14_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int wl,n,id,contador,h,f,prod,nprod,serprod,tprod;
        wl=1;n=1;id=0;contador=0;nprod=0;tprod=0;prod=0;
        while (wl==n) {
            System.out.println("cero para terminar");
            System.out.println("ingrese id o cedula de empleado");
            id=teclado.nextInt();
            if (id==0) {
                n=2;
            }
            else{
                if (id>=999999 && id<=1999999999) {
                    contador+=1;
                    System.out.println("cero para no ingresar productos");
                    System.out.println("cuantos productos ingresara");
                    nprod=teclado.nextInt();
                    if (nprod==0) {
                        System.out.println("gracias");
                    }
                    else{
                        for(f=1;f<=nprod;f++){
                            System.out.println("ingrese el id del producto");
                            prod=teclado.nextInt();
                            tprod+=1;
                        }
                    }
                } else {
                    System.out.println("id no existe");
                }
            }
        }
        System.out.println("el total de productos es: "+tprod);
        System.out.println("numero de empleados: "+contador);
    }
}
