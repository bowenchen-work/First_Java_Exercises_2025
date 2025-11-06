package Arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioEjemploArray2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numAlumnos = teclado.nextInt();
        int[] notasAlumnos = new int[numAlumnos];

        //Preguntar al array su capacidad (tamaño)
        int capacidad = notasAlumnos.length;
        Random generadorAleatorios = new Random();//crea el generador de aleatoriedad

        for(int cont = 0; cont < notasAlumnos.length; cont++){
            int numAleatorio = generadorAleatorios.nextInt();//le pedimos un entero aleatorio
            notasAlumnos[cont] = numAleatorio;

            System.out.println(notasAlumnos[cont]);

        }

        for (int contArray = 1; contArray < numAlumnos; contArray++) {
            System.out.println(notasAlumnos[contArray]);
        }
    }
}
