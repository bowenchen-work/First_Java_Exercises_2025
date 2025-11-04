package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 10 números no nulos y te digo si hay o no números negativos:");

        boolean numNegativo = false;

        for (int cont = 1; cont <= 10; cont++) {
            int numUsu = teclado.nextInt();

            if (numUsu < 0) {
                numNegativo = true;
            }
        }
        if (numNegativo) {
            System.out.println("En la lista sí hay número/s negativo.");

        } else {
            System.out.println("En la lista no hay número/s negativo");
        }
    }
}
