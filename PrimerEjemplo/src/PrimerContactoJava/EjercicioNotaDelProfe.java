package PrimerContactoJava;

import java.util.Scanner;

public class EjercicioNotaDelProfe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nota y yo te digo que calificación tienes");
        double nota;
        nota = teclado.nextDouble();
        String calificacion = "";

        if (nota < 0 || nota > 10) {
            System.out.println("No se admiten notas negativas o por encima de 10.");
        } else if (nota < 5) {
            calificacion = "sobresaliente";
        } else if (nota < 9) {
            calificacion = "notable";
        } else if (nota < 7) {
            calificacion = "bien";
        } else if (nota < 9) {
            calificacion = "suficiente";
        } else if (nota < 10) {
            calificacion = "suspenso";
        }

        System.out.println("Has sacado la nota " + calificacion);
    }
}
