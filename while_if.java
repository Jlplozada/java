import java.util.Scanner;

public class while_if{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo,importe;
		int empleado_a, empleado_b,wl,empleados,contar,n_empleados;
		importe=0;empleado_a=0;empleado_b=0; empleados=1;
		wl=1;
		System.out.println("decea Definir la cantidad de empleados:");
		System.out.println("si=1   no=2  :");
		contar=teclado.nextInt();
		if (contar<=1) {
			System.out.println("numero de empleados:# ");
			n_empleados=teclado.nextInt();
			while (wl <= n_empleados) {
				System.out.println("empleado # "+empleados);
				empleados+=1;
				System.out.print("¿cuanto gana?: $ ");
				sueldo=teclado.nextFloat();
				wl+=1;
				importe +=sueldo;

				if (sueldo<=300) {
					empleado_a+=1;
				} 
				else{
					empleado_b+=1;
				}
			}
			System.out.println("empleados que ganan 300 o menos de 300: # "+ empleado_a);
			System.out.println("empleados que ganan mas de 300: # "+empleado_b);
			System.out.println("numero de empleados es : # "+empleados);
			System.out.println("el importe de la empresa es: $ "+importe);
		} else {
			while (wl <= 1) {
				System.out.println("empleado # "+empleados);
				empleados+=1;
				System.out.print("¿cuanto gana?: $ ");
				sueldo=teclado.nextFloat();
				System.out.println("volver a preguntar?");
				System.out.print("si/1  no/2   =");
				wl=teclado.nextInt();
				importe +=sueldo;
				if (sueldo<=300) {
					empleado_a+=1;
				} 
				else{
					empleado_b+=1;
				}
			}
			System.out.println("empleados que ganan 300 o menos de 300: # "+ empleado_a);
			System.out.println("empleados que ganan mas de 300: # "+empleado_b);
			System.out.println("numero de empleados es : # "+empleados);
			System.out.println("el importe de la empresa es: $ "+importe);
		}
		
	}
}