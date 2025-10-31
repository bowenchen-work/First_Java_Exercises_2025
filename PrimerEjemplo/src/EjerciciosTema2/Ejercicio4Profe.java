package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio4Profe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un año y te digo si es bisiesto.");
        int numero = teclado.nextInt();

        boolean divisible4 = (numero % 4) == 0;
        boolean divisible100 = (numero % 100) == 0;
        boolean divisible400 = (numero % 400) == 0;

        if ((divisible4 && divisible400) || (divisible4 && !divisible100)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
