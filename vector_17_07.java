public class vector_17_07 {
    package java_17_07;
import java.util.Scanner;
public class java_17_07 {
	private Scanner teclado;
	private double[] nota;
	private double notaA=0,notaB=0,notaC=0,notaAf=0,notaBf=0,notaCf=0;
	private double promedio;
	private double not=0;
	public void carga(){
		teclado = new Scanner(System.in);
		nota=new double[3];
		System.out.println("El siguiente programa calculara sus tres notas de asignatura y le informara su nota general");
		
		for(int f=0;f<3;f++) {
			if(f==0) {
				System.out.print("Ingrese la nota de trabajos 30%: ");
				nota[f]=teclado.nextFloat();				
			}
			else {
				if(f==1) {
					System.out.print("ingrese la nota de auto evaluacion 10%: ");
					nota[f]=teclado.nextFloat();		
				}
				else {
					if(f==2) {
						System.out.print("ingrese la nota del parcial 60%: ");
						nota[f]=teclado.nextFloat();		
					}
				}
			}
			
		}
	}
	public void prom(){
		for(int f=0;f<3;f++) {
			if(f==0) {
				notaAf=nota[f];
				notaA=notaAf*0.1;
			}
			else {
				if(f==1) {
					notaBf=nota[f];
					notaB=notaBf*0.3;
				}
				else {
					if(f==2) {
						notaCf=nota[f];
						notaC=notaCf*0.6;
					}
				}
			}
		}
		not=notaA+notaB+notaC;
		
	}
	public void semestre(){
		System.out.print("su promedio de semestre es de: "+not);
	}
	public static void main(String[]ar){
		java_17_07 notas=new java_17_07();
		notas.carga();
		notas.prom();
		notas.semestre();
	}
}
}
