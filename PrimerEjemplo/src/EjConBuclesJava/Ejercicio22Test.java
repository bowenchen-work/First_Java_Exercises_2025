package EjConBuclesJava;

import java.util.Scanner;

public class Ejercicio22Test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te hago una pirámide con base al número que me has dado:");
        int numUsu = teclado.nextInt();
        int calcEspacio = 0;
        calcEspacio = (numUsu * 2) -1;
        String espacio = " ";

        for (int cont = 1; cont <= numUsu; cont++) {
            for (int contEspacio = 1; contEspacio <= cont; contEspacio++) {
                System.out.print(" ");
            }
            for (int contAsterisc = 1; contAsterisc <= cont; contAsterisc++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
