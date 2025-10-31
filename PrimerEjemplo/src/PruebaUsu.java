import java.util.Scanner;

public class PruebaUsu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad, por favor ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Me dices que tienes " + edad + " años");

        System.out.println("Dime tu nombre por favor");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
