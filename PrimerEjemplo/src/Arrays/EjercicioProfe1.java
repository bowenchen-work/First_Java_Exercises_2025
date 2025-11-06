package Arrays;

import java.util.Scanner;

public class EjercicioProfe1 {
    public static void main(String[] args) {
        /*
         * Ejercicio: pedir al usuario cuántos amigos tiene
         * Crear un array de edades y otro de nombres, de longitud igual al nº de amigos
         * Con un bucle, ir pidiendo edad y nombre de cada amigo. Meter cada valor en cada array
         * Luego mostrar los datos: podéis hacerlo "a mano" o con un bucle
         * */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos amigos tines? Introduce en número de amigos que tienes:");
        int numAmigosUsu = teclado.nextInt();

        System.out.println("Gracias, ahora de uno en uno te voy preguntando el nombre y la edad de cada amigo.");

        /*
        do {
            for (int contAmigo = 1; contAmigo <= numAmigosUsu; contAmigo++) {

                System.out.println("Dime nombre del amigo por favor:");
                String nombAmigo = teclado.nextLine();
                nombAmigo[numAmigosUsu] = nombAmigo;

                System.out.println("Ahora dime su edad:");
                int edadAmigo = teclado.nextInt();
                edadAmigo[numAmigosUsu] = edadAmigo;
            }
        }        *
        * */

    }
}
