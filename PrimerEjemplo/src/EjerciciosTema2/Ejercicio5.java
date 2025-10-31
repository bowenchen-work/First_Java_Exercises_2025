package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime las horas que haces o de otro empleado y te digo cuanto su sueldo.");
        System.out.println("Introduce las horas por favor:");
        Scanner teclado = new Scanner(System.in);
        float horas = 0;
        float sueldo = 0;
        horas = teclado.nextFloat();

        if (horas <= 20){
            sueldo = horas * 12;
        } else if (horas > 20 && horas < 30) {
            sueldo = horas * 15;
        } else if (horas > 30) {
            sueldo = horas * 25;
        }
        System.out.println("El sueldo es de: " + sueldo + "€.");
    }
}
