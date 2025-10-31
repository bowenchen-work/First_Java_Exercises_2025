package EjerciciosTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7Prueba2 {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Te genero 8 digitos aleatorios del DNI para que mires que letra le corresponde.");

        for (int cont = 1; cont <= 8 ; cont++) {
            int numRandom = generador.nextInt(0,10);
            System.out.print(numRandom);
        }


    }
}
