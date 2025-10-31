package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio3Correccion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te mostraré su tabla de multiplicar. Inserte número por favor:");
        int numero = teclado.nextInt();
        int cont;
        for (cont = 0; cont <= 10; cont++) {
            int resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
        }
        System.out.println("El último valor es: " + cont);
    }
}
