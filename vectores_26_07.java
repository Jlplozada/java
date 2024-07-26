import java.util.Scanner;
public class vectores_26_07 {
    public Scanner teclado=new Scanner(System.in);
    public int ns;
    public void err(){
        System.err.println("");
    }
    public void medida(){
        System.out.println("             Bienvenido                  ");
        System.out.println("antes de iniciar ajustaremos la velocidad");
        System.out.println("        del paso de mensajes.            ");
        System.out.println("ingresa un numero entero el cual se tomara");
        System.out.println("      como la cantidad de segundos        ");
        System.out.println("     entre los dialogos del sistema       ");
        System.out.println(" recomendamos la velocidad de ( 15 )       ");
        System.out.println();
        System.out.print("Segundos:   # ");
        ns=teclado.nextInt();
    }
    public void introducion(){
        System.out.println("               El vector            ");
        System.out.println("un vector es una estructura de datos");
        System.out.println(" que permite almacenar un conjunto  ");
        System.out.println("       de datos del mismo tipo.     ");
        System.out.println("");
        System.out.println("con un unico nombre se define un vector");
        System.out.println("  y por medio de un subindice hacemos  ");
        System.out.println("hacemos referencia a cada elemento del ");
        System.out.println("           mismo componente            ");

    }
    public void ej1(){
        System.out.println("                ejemplo visaul                       ");
        System.out.println("");
        System.out.println("[ n0 ],[ n1 ],[ n2 ],[ n3 ],[ n4 ]............[ n# ],");
        System.out.println("     cada N# indica su lugar en el sub indice        ");
    }
    public void ej1_1(){
        System.out.println("                     codigo                             ");
        System.out.println("");
        System.out.println("         public float[] dato;                           ");
        System.out.println();
        System.out.println("//Definimos la variable tipo float con el vector [] ");
        System.out.println("//y la nombramos como Dato");
    }
    public void ej1_2(){
        System.out.println("//al tener definido el vector vamos a indicar la cantidad         ");
        System.out.println("//de indices teniendo en cuenta que enpieza desde 0               ");
        System.out.println("");
        System.out.println("                       inicializar vector                         ");
        System.out.println("");
        System.out.println("  -dato=new float[N#] - ¨N# se tomara como la cantidad de espacios ¨");
        
    }
    public void ej1_3(){
        System.out.println("                          codigo                                     ");
        System.out.println("");
        System.out.println("public class Vectores {                                              ");
        System.out.println("    private Scanner teclado;                                         ");
        System.err.println("    private float[] dato;                                            ");
        System.out.println("        public void cargar() {                                       ");
        System.out.println("           teclado=new Scanner(System.in);                           ");
        System.out.println("           dato=new float[5];                                        ");
        System.out.println("           for(int f=0;f<5;f++)                                      ");
        System.out.println("             System.out.print('Ingrese la altura de la persona:');   ");
        System.out.println("             dato[f]=teclado.nextFloat();                         ");
        System.out.println("           }                                                         ");
        System.out.println("         }                                                           ");
        System.out.println("       }                                                             ");
    }
    public void ej2(){
        //toma de datos
        System.out.println("                Ejemplo                           ");
        System.out.println("");
        System.out.println("//seremos mas didacticos.                         ");
        System.out.println("//usaremos un vector con 5 espacios               ");
        System.out.println("");
        System.out.println(" [ n0 ], [ n1 ], [ n2 ], [ n3 ].....[ N4 ]"        );
        System.out.println("");
        System.out.println("teniendo en cuenta que el vector inicia desde cero");
    }
    public void ej2_1(){
        int f,sum=0,m1,m5;
        int[] var;
        System.out.println("en este ejemplo ingresaremos 5 vectores ");
        System.out.println("");
        var=new int[5];
        for(f=0;f<5;f++){
            System.out.println("ingresa un numero para el vector"+"[ "+f+" ]");
            var[f]=teclado.nextInt();
        }
        System.out.println("");
        System.out.println("los vectores quedarian en este orden ");
        for(f=0;f<5;f++){
            System.out.print("[ "+var[f]+"],");
        }
        for(f=0;f<5;f++){
            sum+=var[f];
        }
        System.out.println( "su suma seria"+sum);
        System.out.println("y si multiplicamos la suma por el ultimo vector 'var[5]' nos daria: "+sum*var[5]);
        System.out.println("o si multiplicamos la suma por el primer vector 'var[5]' nos daria: "+sum*var[1]);
        System.out.println("");

    }
    public void fin(){
        System.out.println("                    GRACIAS          ");
    }
    public void pantalla(){
        System.out.print("\033[H\033[2J");  
        //recurso tomado de "https://rootstack.com/es/blog/java-limpiar-pantalla" 
        //uso limpiar la pantalla del terminal para iniciar nuevo texto
    }
    public void pausa(){
        try{
            Thread.sleep(ns*1000); //formula para convertir mill a segundos 
            //thread.sleep suspende una tarea por una cantidad x de tiempo
        }catch(Exception e){
            System.out.println(e);
            //
        }
        //recurso tomado de "https://es.stackoverflow.com/questions/58165/c%C3%B3mo-hacer-que-una-l%C3%ADnea-de-c%C3%B3digo-inicie-despu%C3%A9s-de-5-segundos-en-java"
        //uso generar una pausa de tiempo para enviar la siguiente pantalla
    }
    public static void main(String[] args) {
        vectores_26_07 vector=new vectores_26_07();
        vector.err();
        vector.pantalla();
        vector.medida();
        vector.pantalla();
        vector.introducion();
        vector.pausa();
        vector.pantalla();
        vector.ej1();
        vector.pausa();
        vector.pantalla();
        vector.ej1_1();
        vector.pausa();
        vector.pantalla();
        vector.ej1_2();
        vector.pausa();
        vector.pantalla();
        vector.ej1_3();
        vector.pausa();
        vector.pantalla();
        vector.ej2();
        vector.pausa();
        vector.pantalla();
        vector.ej2_1();
        vector.pausa();
        vector.pantalla();
        vector.fin();
        vector.pausa();
        vector.pantalla();
    }
}
