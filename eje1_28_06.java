import java.util.Scanner;
public class eje1_28_06 {
    private Scanner teclado;
    private float suma,resta,divicion,multiplicacion,potenciacion,porcentaje,sen,cos,tan,log,pi,e,dato1,dato2,dato3;
    private int wl=1,wlmenu=1,menu;
    public void menu(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenido ");
        System.out.println("a continuacion se realizara una operacion de dos datos Numericos");
        System.out.println("favor ingresar primer dato");
        dato1=teclado.nextFloat();
        System.out.println("favor ingresar segundo dato");
        dato2=teclado.nextFloat();
        System.out.println("que operacion deceas realizar con los dos datos");
        System.out.println("1.suma  2.resta  3.divi");
        System.out.println("4.mult  5.poten  6.porce");
        System.out.println("7.sen   8.cos    9.tan");
        System.out.println("10.log  11.pi    12.e");
        System.out.println("        0.terminar ");

        menu=teclado.nextInt();
    }
    public void calculadora(){
            if (menu==1) {
                // suma
                dato3=dato1+dato2;
            } else {
                if (menu==2) {
                    // resta
                    dato3=dato1-dato2;
                } else {
                    if (menu==3) {
                        // divicion
                        dato3=dato1/dato2;
                    } else {
                        if (menu==4) {
                            // multiplicacion
                            dato3=dato1*dato2;
                        } else {
                            if (menu==5) {
                                // potenciacion
                                dato3=(int)Math.pow(dato1, dato2);
                            } else {
                                 if (menu==6) {
                                        // porce
                                        dato3=dato1*(dato2/100);
                                    } else {
                                        if (menu==7) {
                                            // sen
                                        } else {
                                            if (menu==8) {
                                                // cos
                                            } else {
                                                if (menu==9) {
                                                    // tan
                                                } else {
                                                    if (menu==10) {
                                                         // log
                                                    } else {
                                                        if (menu==11) {
                                                            // pi
                                                        } else {
                                                            if (menu==12) {
                                                                // e
                                                            } else {
                                                                if (menu==0) {
                                                                    wlmenu=2;
                                                                } else {
                                                                    System.out.println("Dato no valido");
                                                                    menu=teclado.nextInt();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

    }
    public void resultado(){
        System.out.println(dato3);
    }
    public static void main(String[] args) {
        eje1_28_06 calculadora1;
        calculadora1=new eje1_28_06();
        calculadora1.menu();
        calculadora1.calculadora();
        calculadora1.resultado();
    }
    
}
