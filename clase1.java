import java.util.Scanner;

public class clase1{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo,importe;
		int empleado_a, empleado_b,wl;
		importe=0;empleado_a=0;empleado_b=0;
		wl=1;
		
		while (wl <= 1) {
			System.out.println("¿cuanto gana?");
			sueldo=teclado.nextFloat();
			System.out.println("volver a preguntar?");
			System.out.print("si/1  no/2   =");
			wl=teclado.nextInt();
			importe +=sueldo;
			if (sueldo<=300) {
				empleado_a+=1;
			} 
			else {
				empleado_b+=1;
			}
		}
		System.out.println("empleados que ganan 300 o menos de 300: # "+ empleado_a);
		System.out.println("empleados que ganan mas de 300: # "+empleado_b);
		System.out.println("el importe de la empresa es: $ "+importe);
	}
}