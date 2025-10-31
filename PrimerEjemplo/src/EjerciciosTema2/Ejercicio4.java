package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Dime un año y te digo si es bisiesto o no.");
        Scanner teclado = new Scanner(System.in);
        int year = 0;
        year = teclado.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("El año " + year + " ES bisiesto.");
        } else {
            System.out.println("El año " + year + " NO es bisiesto.");
        }
    }
}
