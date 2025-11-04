package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una secuencia de números (escribe 0 para terminar):");

        int numPositivos = 0;
        int numNegativos = 0;
        boolean hayNegativo = false;

        while (true) {
            int numero = teclado.nextInt();
            if (numero == 0) {
                System.out.println("\nHas terminado el programa.");
                break;
            }

            if (numero < 0) {
                numNegativos++;
                hayNegativo = true;
            } else {
                numPositivos++;
            }
        }

        System.out.println("¿Hubo números negativos?: " + hayNegativo);
        System.out.println("Cantidad de números positivos: " + numPositivos);
        System.out.println("Cantidad de números negativos: " + numNegativos);
    }
}
