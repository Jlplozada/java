import java.util.Scanner;

public class clase_03_08 {
    public Scanner teclado = new Scanner(System.in);
    public int num;
    public String[] nombres, id, idedad, idficha;
    public int[] ficha, edad;

    public void txt() {
        System.out.println("         bienvenido");
        System.out.println("el siguiente programa de dara 3 listas");
        System.out.println("ordenadas por nombre, ficha y edad");
        System.out.println(" ");
        System.out.println("Ingresa una cantidad de personas: ");
        num = teclado.nextInt();
    }

    public void carga() {
        nombres = new String[num];
        ficha = new int[num];
        edad = new int[num];
        id = new String[num];
        idedad = new String[num];
        idficha = new String[num];
        for (int f = 0; f < id.length; f++) {
            System.out.print("Nombre: ");
            nombres[f] = teclado.next();
            System.out.print("Ficha: ");
            ficha[f] = teclado.nextInt();
            System.out.print("Edad: ");
            edad[f] = teclado.nextInt();
            id[f] = nombres[f] + " (" + edad[f] + " años) (" + ficha[f] + ")";
            idficha[f] = "(" + ficha[f] + ")" + "(" + edad[f] + ")" + nombres[f];
            idedad[f] = "(" + edad[f] + ")" + "(" + ficha[f] + ")" + nombres[f];
        }
    }

    public void orden() {
        for (int k = 0; k < id.length; k++) {
            for (int f = 0; f < id.length - 1 - k; f++) {
                if (id[f].compareTo(id[f + 1]) > 0) {
                    String nombreid = id[f];
                    id[f] = id[f + 1];
                    id[f + 1] = nombreid;
                }
                if (idedad[f].compareTo(idedad[f + 1]) > 0) {
                    String id_edad = idedad[f];
                    idedad[f] = idedad[f + 1];
                    idedad[f + 1] = id_edad;
                }
                if (idficha[f].compareTo(idficha[f + 1]) > 0) {
                    String id_ficha = idficha[f];
                    idficha[f] = idficha[f + 1];
                    idficha[f + 1] = id_ficha;
                }
            }
        }
    }

    public void nombre() {
        System.out.println("IDs ordenados por nombre:");
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }

    public void edad() {
        System.out.println("IDs ordenados por edad:");
        for (int i = 0; i < idedad.length; i++) {
            System.out.println(idedad[i]);
        }
    }

    public void ficha() {
        System.out.println("IDs ordenados por ficha:");
        for (int i = 0; i < idficha.length; i++) {
            System.out.println(idficha[i]);
        }
    }
    public void pantalla(){
        System.out.print("\033[H\033[2J");
    }
    public void pausa(){
        try{
            Thread.sleep(5*1000);
        }catch(Exception e){
            System.out.println(e);
        }
    public static void main(String[] args) {
        clase_03_08 orden = new clase_03_08();
        orden.pantalla();
        orden.txt();
        orden.pausa();
        orden.pantalla();
        orden.carga();
        orden.orden();
        orden.nombre();
        orden.pausa();
        orden.ficha();
        orden.pausa();
        orden.edad();
        orden.pausa();
    }
}
