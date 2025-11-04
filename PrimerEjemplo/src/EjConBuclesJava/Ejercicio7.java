package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una lista de hasta 10 múmeros y luego te digo cuántos son positivos y cuántos son negativos.");
        int numUsu = 0;

        int numPositivo = 0;
        int numNegativo = 0;

        for (int cont = 1; cont <= 10; cont++) {
            numUsu = teclado.nextInt();

            if (numUsu < 0) {
                numNegativo = numNegativo + 1;
            } else if (numUsu >= 0) {
                numPositivo = numPositivo + 1;
            }
        }

        System.out.println("En los números introducidos hay " + numPositivo + " números positivos y " + numNegativo + " números negativos.");
    }
}
