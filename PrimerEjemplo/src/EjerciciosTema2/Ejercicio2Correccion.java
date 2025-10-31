package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio2Correccion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionUsu = 0;

        float num1 = 0;
        float num2 = 0;
        double resultado = 0;

        do {
            System.out.println("Bienvenido al MENÚ, en que le puedo ayudarle hoy?");
            System.out.println("Tienes 4 opciones en el menú, solo tienes que escribir un número del 1-4 dependiendo de lo que desee.");
            System.out.println("1 SUMAR, 2 DIVIDIR, 3 POTENCIA1 (elevado al número que pongas), 4 POTENCIA2 (inserta su base y exponiente)");
            opcionUsu = teclado.nextInt();

            switch (opcionUsu) {
                case 1:
                    System.out.println("Dime número 1 y número 2 por favor.");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    resultado = num1 + num2;
                    System.out.println("La suma es " + resultado + ".");
                    break;
                case 2:
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
                case 3:
                    System.out.println("Dime un número que servirá de base y exponiente por favor.");
                    num1 = teclado.nextInt();
                    num2 = num1;
                    resultado = Math.pow(num1, num1);
                    System.out.println("El resultado es " + resultado + ".");
                    break;
                case 4:
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
                        resultado = 1 / resultado;
                        System.out.println("El resultado es " + resultado + ".");
                    }
                    break;
                case 0:
                    System.out.println("Hasta la próxoma, gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionUsu != 0);
    }
}

