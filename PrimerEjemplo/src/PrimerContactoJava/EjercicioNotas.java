package PrimerContactoJava;

import java.util.Scanner;

public class EjercicioNotas {
    public static void main(String[] args) {
        //Pedir una nota numerica a usuario.
        //Compribar que la nota es >=0 y <=10.
        //Cualquier nota fuera de ese rando no es válida
        //Con esa nota, tenemos que traducir a Calificación (sobresaliente, notable, etc...)
        //0 a menor a 5 --> es suspenso
        //5 a menor a 6 --> suficiente
        //6 a menor a 7 --> bien
        //7 a menor a 9 --> ntable
        //9 a menor a 10 --> sobresaliente

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nota y yo te digo que calificación tienes");
        float nota;
        nota = teclado.nextFloat();

        if (nota < 0 || nota > 10) {
            System.out.println("No se admiten notas negativas o por encima de 10.");
        } else if (nota <= 10 && nota >= 9) {
            System.out.println("Tines un sobresaliente!");
        } else if (nota <= 9 && nota >= 7) {
            System.out.println("Tienes un notable!");
        } else if (nota <= 7 && nota >= 6) {
            System.out.println("Tienes un bien.");
        } else if (nota <= 6 && nota >= 5) {
            System.out.println("Tienes un suficiente.");
        } else if (nota <= 5 && nota >= 0) {
            System.out.println("Tienes un suspenso...");
        }
    }
}
