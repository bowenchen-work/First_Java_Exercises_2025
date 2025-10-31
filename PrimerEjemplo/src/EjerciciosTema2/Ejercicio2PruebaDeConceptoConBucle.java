package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio2PruebaDeConceptoConBucle {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema");
        Scanner teclado = new Scanner(
                System.in
        );

        int opcion = 0;
        do {
            System.out.println("Elija su opción");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Dividir");
            System.out.println("0 - Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ok, vamos a sumar. Te voy a pedir dos numeros");
                    break;
                case 2:
                    System.out.println("Ok, vamos a restar. Te voy a pedir dos numeros");
                    break;
                case 3:
                    System.out.println("Ok, vamos a dividir. Te voy a pedir dos numeros");
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor pruebe de nuevo");
            }
        } while (opcion != 0);
    }
}
