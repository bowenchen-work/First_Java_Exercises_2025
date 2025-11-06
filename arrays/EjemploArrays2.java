package arrays;

import java.util.Random;
import java.util.Scanner;

public class EjemploArrays2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Con cuántos alumnos trabajamos? Dime el nº y te genero notas aleatorias");
        int numAlumnos = teclado.nextInt();
        int[] notasAlumnos = new int[numAlumnos];

        //Preguntar al array su capacidad (tamaño)
        int capacidad = notasAlumnos.length;
        System.out.println("El array tiene esta capacidad: " + capacidad);
        Random generadorAleatorios = new Random();//crea el generador de aleatoriedad

        for(int cont = 0; cont < notasAlumnos.length; cont++){

            int numAleatorio = generadorAleatorios.nextInt(0, 10);//le pedimos un entero aleatorio
            notasAlumnos[cont] = numAleatorio;
        }
        //1º: Recorrer el array mostrando todos los valores. Uno en cada línea

        //2º Recorrer el array (en otro bucle distinto) y queremos hacer LA MEDIA de las notas

        //3º Recorrer el array hasta que encontremos una nota que sea igual a 10
        //(si la nota es igual a 10, el bucle deberia detenerse)NO USAR BREAK



    }
}
