package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te enseño su factorial:");
        int numeroUsu = teclado.nextInt();

        int factorial = 1;

        for (int cont = 1; cont <= numeroUsu; cont++) {
            factorial = factorial * cont;
            System.out.println(factorial);
        }
    }
}
