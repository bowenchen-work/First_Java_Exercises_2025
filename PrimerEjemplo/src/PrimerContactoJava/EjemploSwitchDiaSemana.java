package PrimerContactoJava;

import java.util.Scanner;

public class EjemploSwitchDiaSemana {
    public static void main(String[] args) {
        /**
         * Tenemos que pedir al usuario un día de la semana en String.
         * Utilizaremos un switch para mostrar por pantalla
         * qué se va a hacer en cada día.
         * De Lunes a Viernes, se mostrará AL INSTITURO.
         * El sábado, ESCAPE ROOM
         * El domingo, CINE
         * Para cualquier otro día, mostraremos que no es válido
         */
        System.out.println("Dime un número de día de la semana, y te digo lo que hago. Los posibles valores son las siguientes:");
        System.out.println("LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO");

        Scanner teclado = new Scanner(System.in);
        String numDia = teclado.nextLine();
        String diaSemana = null;

        switch (numDia) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                diaSemana = "AL INSTITUTO";
                break;
            case "SABADO":
                diaSemana = "ESCAPE ROOM";
                break;
            case "DOMINGO":
                diaSemana = "CINE";
                break;
            default:
                System.out.println("Ese día no es válido.");
        }

        if (diaSemana != null) {
            System.out.println("Ese dia " + diaSemana);
        }
    }
}
