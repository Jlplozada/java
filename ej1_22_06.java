import java.util.Scanner;

public class ej1_22_06 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // un parqueadero quiere saber  cuanto cobrar por hora a sus vehiculos
        float moto,carro,tpagar,tdia=0,h1,h2,th;
        moto=1000;
        carro=2000;
        int wl=1,fwl=1,menu,menu2,fhora,tmoto=0,tcarro=0;
        do {
            System.out.println("Bienvenido al parqueasero #######");
            System.out.println("¿desea ingresar un vehiculo nuevo?");
            System.out.println("1.SI      /          2.NO");
            System.out.print("#");
            menu=teclado.nextInt();
            if (menu==2) {
                fwl=0;
            }else{
                if (menu==1) {
                    System.out.println("ingrese el tipo de vehiculo");
                    System.out.println("1.moto");
                    System.out.println("2.carro");
                    menu2=teclado.nextInt();
                    if (menu2==1) {
                        tmoto++;
                        System.out.println("Solo se tomaran las horas en formato de 24H");
                        System.out.println("use , para separar la hora y el minuto");
                        System.out.println(" ejemplo 00,00");
                        System.out.println("ingrese la hora de entrada");
                        h1=teclado.nextFloat(); 
                        System.out.println("use , para separar la hora y el minuto");
                        System.out.println(" ejemplo 00,00");
                        System.out.println("ingrese hora de salida");
                        h2=teclado.nextFloat();
                        th=h2-h1;
                        tpagar=moto*th;
                        System.out.println("______________________________________");
                        System.out.println("el total de horas es: # "+th+" H");
                        System.out.println("el costo de parqueadero es de: $ "+tpagar+" pesos");
                        tdia=tdia+tpagar;
                        System.out.println(" ");
                        System.out.println(" ");

                    }else{
                        if (menu2==2) {
                            tcarro++;
                            System.out.println("Solo se tomaran las horas en formato de 24H");
                            System.out.println("use , para separar la hora y el minuto");
                            System.out.println(" ejemplo 00,00");
                            System.out.println("ingrese la hora de entrada");
                            h1=teclado.nextFloat(); 
                            System.out.println("use , para separar la hora y el minuto");
                            System.out.println(" ejemplo 00,00");
                            System.out.println("ingrese hora de salida");
                            h2=teclado.nextFloat();
                            th=h2-h1;
                            tpagar=carro*th;
                            System.out.println("______________________________________");
                            System.out.println("el total de horas es: # "+th+" H");
                            System.out.println("el costo de parqueadero es de: $ "+tpagar+" pesos");
                            tdia=tdia+tpagar;
                            System.out.println(" ");
                            System.out.println(" ");            
                        }else{
                            System.out.println("dato no valido");
                        }
                    }

                    
                }
                else{
                    System.out.println("dato no valido");
                }
            }

            
        } while (wl==fwl);
        System.out.println("cantidad de carros atendidos: "+tcarro);
        System.out.println("cantidad de motos atendidos: "+tmoto);
        System.out.println("ganancias del dia: $"+tdia+" pesos");
    }
}
