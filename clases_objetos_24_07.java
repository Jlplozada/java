import java.util.Scanner;
public class clases_objetos_24_07 {
    public Scanner teclado ;
    public double dato1,dato2,dato3,pt,pin;
    public int op,mn,pi;
    public String mens;
    public void text1(){
        System.out.println("        -Calculadora-             ");
        System.out.println("  Este algoritmo se encargara de  ");
        System.out.println(" dar el resultado de una operacion");
        System.out.println("  selecionada en el siguiente menu");
        System.out.println(" usando dos o un digitos numericos");
    }
    public void dato(){
        if (op==5) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("ingrese valor base");
            System.out.print("# ");
            dato1=teclado.nextDouble();
            System.out.println("ingrese valor potencia");
            System.out.print("# ");
            dato2=teclado.nextDouble(); 
        } else {
            if (op==6) {
                Scanner teclado=new Scanner(System.in);
                System.out.println("ingrese el valor");
                System.out.print("# ");
                dato1=teclado.nextDouble();
                System.out.println("ingrese el porcentaje en numero entero");
                System.out.print("# ");
                dato2=teclado.nextDouble();
            } else {
                if (op==7) {
                    Scanner teclado=new Scanner(System.in);
                    System.out.println("ingrese valor a calcular");
                    System.out.print("# ");
                    dato1=teclado.nextDouble(); 
                } else {
                    if (op==8) {
                        Scanner teclado=new Scanner(System.in);
                        System.out.println("ingrese valor a calcular");
                        System.out.print("# ");
                        dato1=teclado.nextDouble();
                    } else {
                        if (op==9) {
                            Scanner teclado=new Scanner(System.in);
                            System.out.println("ingrese valor a calcular");
                            System.out.print("# ");
                            dato1=teclado.nextDouble();
                        } else {
                            if (op==10) {
                                Scanner teclado=new Scanner(System.in);
                                System.out.println("ingrese valor a calcular");
                                System.out.print("# ");
                                dato1=teclado.nextDouble();
                            } else {
                                if (op==11) {
                                    Scanner teclado=new Scanner(System.in);
                                    System.out.println("ingrese valor a calcular");
                                    System.out.print("# ");
                                    dato1=teclado.nextDouble();
                                    System.out.println("quiere que la operacion de "+dato1+"con PI sea:");
                                    System.out.println("1.sume");
                                    System.out.println("2.reste");
                                    System.out.println("3.multiplique");
                                    System.out.println("4.divida");
                                    dato2=teclado.nextDouble();
                                    System.out.print("# ");
                                } 
                                else {
                                    if (op==12) {
                                        Scanner teclado=new Scanner(System.in);
                                        System.out.println("ingrese valor a calcular");
                                        System.out.print("# ");
                                        dato1=teclado.nextDouble();
                                        System.out.println("quiere que la operacion de "+dato1+"con E sea:");
                                        System.out.println("1.sume");
                                        System.out.println("2.reste");
                                        System.out.println("3.multiplique");
                                        System.out.println("4.divida");
                                        dato2=teclado.nextDouble();
                                        System.out.print("# ");

                                    } else {
                                        Scanner teclado=new Scanner(System.in);
                                        System.out.println("ingrese primer numero");
                                        System.out.print("# ");
                                        dato1=teclado.nextDouble();
                                        System.out.println("ingrese segundo numero");
                                        System.out.print("# ");
                                        dato2=teclado.nextDouble();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    } 
    public void menu(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("       opciones de calculadora       ");
        System.out.println("  1.SUMA      2.RESTA     3.MULTIPLICACION ");
        System.out.println("  4.DIVICION  5.POTENCIA  6.PORCENTAJE     ");
        System.out.println("  7.SENO      8.COSENO    9.TANGENTE       ");
        System.out.println("  10.LOG      11.PI       12.E             ");
        op=teclado.nextInt();
        System.out.print("# ");

    }
    public void op(){
        System.out.println("...");
            if (op==1) {
                //suma
                mens="el resultado de la suma es: ";
                dato3=dato1+dato2;
            } else {
                if (op==2) {
                    //resta
                    mens="el resultado de la resta es: ";
                    dato3=dato1-dato2;
                } else {
                    if (op==3) {
                        //multiplicacion
                        mens="el resultado de la multiplicacion es: ";
                        dato3=dato1*dato2;
                    } else {
                        if (op==4) {
                            if(dato2!=0){
                                //divicion
                                System.out.println("Divicion por cero nmo valido");
                            }else{
                                mens="el resultado de la divicion es: ";
                                dato3=dato1=dato2;
                            }
                        } else {
                            if (op==5) {
                                //potenciacion
                                mens="el resultado de la potenciacion es: ";
                                dato3=Math.pow(dato1, dato2);
                            } else {
                                if (op==6) {
                                    //porcentaje
                                    mens="el porcentaje de la operacion "+dato1+" por el "+dato2+"%  es de: ";
                                    pt=dato2/100;
                                    dato3=dato1*pt;
                                } else {
                                    if (op==7) {
                                        //seno
                                        mens="el seno de "+dato1+"es: ";
                                        dato3=Math.sin(dato1);
                                    } else {
                                        if (op==8) {
                                            //coseno
                                            mens="el coseno de "+dato1+" es: ";
                                            dato3=Math.cos(dato1);
                                        } else {
                                            if (op==9) {
                                                //tangent
                                                mens="la tangente de "+dato1+" es: ";
                                                dato3=Math.tan(dato1);
                                            } else {
                                                if (op==10) {
                                                    //log
                                                    mens="el log de "+dato1+" es: ";
                                                    dato3=Math.log(dato1);
                                                } else {
                                                    if (op==11) {
                                                        //pi
                                                        if (dato2==1) {
                                                            dato3=dato1+3.1415;
                                                            mens="la suma de "+dato1+" por pi es: ";
                                                        } else {
                                                            if (dato2==2) {
                                                                dato3=dato1-3.1415;
                                                                mens="la resta de "+dato1+" por pi es: ";
                                                            } else {
                                                                if (dato2==3) {
                                                                    dato3=dato1*3.1415;
                                                                    mens="la multiplicacion de "+dato1+" por pi es: ";
                                                                } else {
                                                                    if (dato2==4) {
                                                                        dato3=dato1/3.1415;
                                                                        mens="la divicion de "+dato1+" por pi es: ";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (op==12) {
                                                            //e
                                                            if (dato2==1) {
                                                                dato3=dato1+2.7183;
                                                                mens="la suma de "+dato1+" por E es: ";
                                                            } else {
                                                                if (dato2==2) {
                                                                    dato3=dato1-2.7183;
                                                                    mens="la resta de "+dato1+" por E es: ";
                                                                } else {
                                                                    if (dato2==3) {
                                                                        dato3=dato1*2.7183;
                                                                        mens="la multiplicacion de "+dato1+" por E es: ";
                                                                    } else {
                                                                        if (dato2==4) {
                                                                            dato3=dato1/2.7183;
                                                                            mens="la divicion de "+dato1+" por E es: ";
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mens="...";
                                                            System.out.println("operacion no valida. Gracias por participar");
                                                            menu();
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
        System.out.println(mens+dato3);
    }
    
    public void pantalla(){
        System.out.print("\033[H\033[2J");  
        //recurso tomado de "https://rootstack.com/es/blog/java-limpiar-pantalla" 
        //uso limpiar la pantalla del terminal para iniciar nuevo texto
    }
    public void pausa(){
        try{
            Thread.sleep(6*1000); //formula para convertir mill a segundos 
            //thread.sleep suspende una tarea por una cantidad x de tiempo
        }catch(Exception e){
            System.out.println(e);
            //
        }
        //recurso tomado de "https://es.stackoverflow.com/questions/58165/c%C3%B3mo-hacer-que-una-l%C3%ADnea-de-c%C3%B3digo-inicie-despu%C3%A9s-de-5-segundos-en-java"
        //uso generar una pausa de tiempo para enviar la siguiente pantalla
    }
    public static void main(String[] args) {
        clases_objetos_24_07 calculadora=new clases_objetos_24_07();
        calculadora.pantalla();
        calculadora.text1();
        calculadora.pausa();
        calculadora.pantalla();
        calculadora.menu();
        calculadora.pantalla();
        calculadora.dato();
        calculadora.pantalla();
        calculadora.op();
        calculadora.resultado();

    }
}