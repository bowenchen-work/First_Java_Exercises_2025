package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dameun número entero entre 0 a 20, y te mostraré los números desde 1 al número entero línea por línea como una pirámide.");
        int numUsuario = teclado.nextInt();


        if (numUsuario < 0 && numUsuario > 20) {
            System.out.print("El número introducido no es válido, pruebe de nuevo por favor.");
        } else {
            for (int contador = 1; contador <= numUsuario; contador++) {
                for (int contadorInterno = 1; contadorInterno <= contador; contadorInterno++) {
                    System.out.print(contador + " ");
                }
                System.out.println();
            }
        }
    }
}

