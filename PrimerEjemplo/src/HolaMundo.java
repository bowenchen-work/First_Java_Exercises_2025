public class HolaMundo {
    public static void main(String[] args) {

        int edadPersona = 6;
        byte variableByte = 4;
        short variable = -15000;
        int contador = 1_000_000;

        float notaAlumno = 3.6f;
        double notaMaxima = 10.0;

        char letraA = 'A';
        char respuestaSi = 'S';
        char respuestaNo = 'N';

        boolean haAcertado = false;
        boolean esFestivo = true;
        boolean aprobado = false;
        String nombre = "Paco";

        System.out.println("Hola Mundo");
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edadPersona + " años.");
        System.out.println("Te gusta Hollow Knight? Si es así escribe " + respuestaSi + " o si no re gusta escribe " + respuestaNo);
        System.out.println("Es festivo " + aprobado);
        System.out.println("Tengo " + contador + " euros en uno de mis muchos bancos.");
        System.out.println("Lo siento Aurelio pero tu nota final es un " + notaAlumno + ", solo puedo decirte que haber estudiao ma...");
        System.out.println("Josefa sabias que Josefina saco un " + notaMaxima + " en el examen de programación???");

        int numero;
        numero = 9;

        int miVariable = 10;
        while (numero <= 100) {
            miVariable = miVariable +1;
            numero = numero + 1;
        }

        miVariable = 2;

        final double PI = 3.1416;
        final double valorGravedad = 9.8;


    }
}
