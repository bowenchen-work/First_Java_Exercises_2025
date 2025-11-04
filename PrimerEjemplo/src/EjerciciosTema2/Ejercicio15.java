package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te CUENTO los múltiplos de 3 que hay hasta ese némro");
        int numero = teclado.nextInt();
        int totalMultiplos3 = 0;
        for (int cont = 1; cont <= numero; cont++) {
            if (cont % 3 == 0){
                totalMultiplos3++;
            }
        }
    }
}
