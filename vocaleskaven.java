import java.util.Scanner;
public class vocaleskaven {
	public static void main(String[] args) {
	     String letras;
		Scanner teclado=new Scanner(System.in);
		
	
int minuscula,dwl=1,sl=0,wl=10,vocal= 0,A=0,E=0,I=0,O=0,U=0;
String Letras;
char a,e,i,o,u;


System.out.println("Bienvenido al programa :D : ");
System.out.println("Porfavor ingresar 1 para iniciar, ingresa 2 para no: ");
minuscula=teclado.nextInt();

if (minuscula==1) {
    do {
        dwl++;
        System.out.println("Ingresa la letra : ");
        Letras=teclado.nextLine();
        System.out.println("   ");
        System.out.println("ingresa otra letra o 1 para salir");
        sl=teclado.nextInt();

        if (sl==1) {
            dwl=11;
        }
        else{

        }
        
            if((Letras.equals('a') || Letras.equals('e')|| Letras.equals('i')|| Letras.equals('o')|| Letras.equals('u'))) {
                vocal++;
                
                if(Letras.equals('a')) {
                    A++;
                    }
                     else 
                         if(Letras.equals('e')) {
                        E++;
                        }
                         else 
                             if(Letras.equals('i')) {
                            I++;
                            }
                             else 
                                 if(Letras.equals('o')) {
                                O++;
                                }
                                 else 
                                     if(Letras.equals('u')) {
                                    U++;
                                    }
                                     else {
                                         System.out.println("Letra no reconocida o incorrecta por favor vuelva a ingresar"); 
                                     }
                
                
            }    


		
}while(dwl<=10);

	System.out.println("La cantidad de veces que se repitio la vocal a es : "+A);
	System.out.println("La cantidad de veces que se repitio la vocal e es : "+E);
	System.out.println("La cantidad de veces que se repitio la vocal i es : "+I);
	System.out.println("La cantidad de veces que se repitio la vocal o es : "+O);
	System.out.println("La cantidad de veces que se repitio la vocal u es : "+U);
   
}}}


