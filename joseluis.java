import java.util.Scanner;

public class joseluis {
	public static void main(string [] ar) {
        //stringo entre parentesis no va ()
		Scanner teclado=new Scanner (System.in);
		int disc,id,edad;
		System.out.print("entra con una discapacidad 1.si 2.no");
		disc=teclado.nextInt();
        //la primera letra del de la variable va en mayuscula despues del next  ejemplo next Int .nexInt
		System.out.print("documento de identidad");
        // system.out.print  "print es para imrpimir en pantalla"
		id=teclado.nextInt();
		System.out.print("edad");
        // system.out.print  "print es para imrpimir en pantalla"
		edad=teclado.nextInt();
        //el punto en teclado.next y la mayuscula en Int
		if( disc = 1 ){
            System.out.print(id+"turno a");
        }
        else {
            if(edad>=20) {
                System.out.print(id+"turno c")
                //syste "m"
            }
            else {

                if(edad>=20) {
                    System.out.print(id+"turno e");
                    //syste "m" y el ; 
                }
            }
			
		}
    }
}
