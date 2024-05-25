package ejercicios_while;
public class ejercicio3 {
    // 3. Realizar un programa que imprima 25 términos de la 
    // serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado).
    public static void main(String[] args) {
        int wl,n;
        n=0;
        wl=1;
        while (wl<=25) {
            wl+=1;
            n+=11;
            System.out.print(n+",");
        }
    }
}
