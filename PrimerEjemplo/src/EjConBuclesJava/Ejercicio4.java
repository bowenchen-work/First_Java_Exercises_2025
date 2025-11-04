package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Te mostraré desde 1 hasta el número que introduzcas:");
        int numero = teclado.nextInt();

        for (int cont = 1; cont <= numero; cont++) {
            System.out.print(cont + ", ");
        }
    }
}
