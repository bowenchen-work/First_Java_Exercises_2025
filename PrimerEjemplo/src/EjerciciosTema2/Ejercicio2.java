package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al MENÚ, en que le puedo ayudarle hoy?");
        System.out.println("Tienes 4 opciones en el menú, solo tienes que escribir un número del 1-4 dependiendo de lo que desee.");
        System.out.println("1 SUMAR, 2 DIVIDIR, 3 POTENCIA1 (elevado al número que pongas), 4 POTENCIA2 (inserta su base y exponiente)");
        Scanner teclado = new Scanner(System.in);
        String opcionUsu = teclado.nextLine();
        String opcion = null;


        float num1 = 0;
        float num2 = 0;
        double resultado = 0;

        switch (opcionUsu) {
            case "1":
                opcion = "SUMAR";
                System.out.println("Dime número 1 y número 2 por favor.");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                resultado = num1 + num2;
                System.out.println("La suma es " + resultado + ".");
                break;
            case "2":
                opcion = "DIVIDIR";
                System.out.println("Dime número 1 y número 2 por favor.");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                if (num1 == 0 || num2 == 0) {
                    System.out.println("ERROR");
                } else if (num1 != 0 && num2 !=0) {
                    resultado = num1 / num2;
                }
                System.out.println("El resultado es "+ resultado + ".");
                resultado = num1 / num2;
                break;
            case "3":
                opcion = "POTENCIA1";
                System.out.println("Dime un número que servirá de base y exponiente por favor.");
                num1 = teclado.nextInt();
                num2 = num1;
                resultado = Math.pow(num1, num1);
                System.out.println("El resultado es " + resultado + ".");
                break;
            case "4":
                opcion = "POTENCIA2";
                System.out.println("Dime un número para la base y otro para el exponiente por favor.");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
                if (num2 % 2 == 0) {
                    resultado = Math.pow(num1, num2);
                    System.out.println("El resultado es " + resultado + ".");
                } else if (num2 == 0) {
                    resultado = 1;
                    System.out.println("El resultado es " + resultado + ".");
                } else if (num2 < 0) {
                    resultado = Math.pow(num1, num2);
                    resultado = (1 / resultado) + num2;
                    System.out.println("El resultado es " + resultado + ".");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
