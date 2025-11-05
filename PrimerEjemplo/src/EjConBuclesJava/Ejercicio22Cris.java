package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio22Cris {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(
                System.in
        );
        System.out.println("Introduce un número para ver su pirámide");
        int filas = teclado.nextInt();
        for (int cont = 0; cont < filas; cont++){
            for (int cont1 = 0; cont1 <= filas-cont; cont1++){
                System.out.print(" ");
            }
            for (int cont2 = 0; cont2 <= cont*2 ; cont2++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
