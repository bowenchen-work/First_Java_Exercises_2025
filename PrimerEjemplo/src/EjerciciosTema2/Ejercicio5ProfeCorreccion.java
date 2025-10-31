package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio5ProfeCorreccion {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int TARIFA_BASICA = 12;
        final int TARIFA_INTERMEDIA = 15;
        final int TARIFA_ALTA = 25;
        int sueldoEmpleado = 0;

        System.out.println("Dime horas y te digo sueldo");
        int horas = teclado.nextInt();

        if (horas > 20) {
            sueldoEmpleado += (horas - 20) * TARIFA_BASICA;
            if (horas > 30) {
                sueldoEmpleado += (horas - 20) * TARIFA_INTERMEDIA;
            } else {
                sueldoEmpleado += 10 * TARIFA_INTERMEDIA;
                sueldoEmpleado += (horas - 30) * TARIFA_ALTA;
            }
        } else {
            sueldoEmpleado += horas * TARIFA_BASICA;
        }
        System.out.println("Sueldo empleado: " + sueldoEmpleado);
    }
}
