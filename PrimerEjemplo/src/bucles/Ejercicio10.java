package bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una secuencia de notas y te digo si hay algún 10. Escribe -1 si quieres terminar el programa.");

        boolean notaDe10 = false;
        float nota = 0;

        do {
            System.out.println("Dime los números por favor.");
            nota = teclado.nextFloat();
            if (nota == 10) {
                notaDe10 = true;
                System.out.println("Hay nota de 10 entre las notas introducidas.");
            } else {
                System.out.println("No hay 10 entre las notas introducidas.");
            }
        } while (nota != -1);
        System.out.println("Fin del programa, gracias por usarlo.");
    }
}
