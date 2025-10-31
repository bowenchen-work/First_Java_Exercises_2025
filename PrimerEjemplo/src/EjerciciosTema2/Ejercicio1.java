package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tres números y te los mostraré ordenados de menor a mayor.");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();
        int numMayor = 0;
        int numMedio = 0;
        int numMenor = 0;

        if (numero1 > numero2 && numero1 > numero3){
            numMayor = numero1;
            if (numero2 > numero3){
                numMedio = numero2;
                numMenor = numero3;
            } else if (numero3 > numero2) {
                numMedio =  numero3;
                numMenor = numero2;
            }
        } else if (numero1 > numero2 && numero1 < numero3) {
            numMedio = numero1;
            numMenor = numero2;
            numMayor = numero3;
        } else if (numero1 < numero2 && numero1 < numero3) {
            numMenor = numero1;
            if (numero2 > numero3){
                numMayor = numero2;
                numMedio = numero3;
            } else if (numero3 > numero2) {
                numMayor = numero3;
                numMedio = numero2;
            }
        }
        System.out.println("Tus números ordenados de menor a mayor es: " + numMenor + ", " + numMedio + " y " + numMayor);
    }
}
