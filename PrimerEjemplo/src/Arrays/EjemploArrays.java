package Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
/*
        double[] notas = new double[6];
        notas[0] = 6.1;//escribiendo un valor en la posicion 0
        notas[1] = 2.3;
        System.out.println("Notas: " + notas);
        double valoPrimeraNota = notas[0];//accediendo al valor en posicion 0
        System.out.println("valoePrimeraNota = " + valoPrimeraNota);
        System.out.println("Notas de posición 0: " + notas[0]);
        System.out.println("Notas de posición 1: " + notas[1]);
*/
        //Crea un array de enteros con las edades de tus 3 mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla
        //Coge la edad del primer elemento, y multiplicalo por 7

        double[] fechaNacimieto = new double[3];
        fechaNacimieto[0] = 19;
        fechaNacimieto[1] = 20;
        fechaNacimieto[2] = 22;
        System.out.println("Edad amigo 1: " + fechaNacimieto[0]);
        System.out.println("Edad amigo 2: " + fechaNacimieto[1]);
        System.out.println("Edad amigo 3: " + fechaNacimieto[2]);

        int mult7EdadAmigo1 = 0;

        mult7EdadAmigo1 = (int) (fechaNacimieto[0] * 7);
        System.out.println("El número que sale al multiplicar por 7 la edad de amigo 1 es: " + mult7EdadAmigo1);

        //Crea un array de Strings, con los nombres de tus mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla

        String[] nombreAmigos = new String[4];
        String amigo1 = "Sung Jin Woo";
        String amigo2 = "James Scholz";
        String amigo3 = "Loid Forger";

        nombreAmigos[0] = amigo1;
        nombreAmigos[1] = amigo2;
        nombreAmigos[2] = amigo3;

        nombreAmigos[3] = "Yaku";

        System.out.println("Mi primer amigo es " + nombreAmigos[0]);
        System.out.println("Mi segundo amigo es " + nombreAmigos[1]);
        System.out.println("Mi tercer amigo es " + nombreAmigos[2]);

        System.out.println("Mi cuarto amigo es " + nombreAmigos[3]);

        /*
        *Ejercicio: pedir al usuario cuántos amigos tiene
        * Crear un array de edades y otro de nombres, de longitud igual al nº de amigos
        * Con un bucle, ir pidiendo edad y nombre de cada amigo. Meter cada valor en cada array
        * Luego mostrar los datos: podéis hacerlo "a mano" o con un bucle
         * */
    }
}
