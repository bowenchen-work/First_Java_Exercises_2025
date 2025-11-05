package PrimerContactoJava;

public class PruebaOperaadores {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        int numero = 0;
        numero = 6 * 3;
        System.out.println(numero);

        int restoDivision = 6 % 2;
        System.out.println(restoDivision);

        int contador = 0;
        contador = contador + 1; //contador++
        contador++;
        contador = contador + 1;// equivalente a contador = contador + 1
        contador += 2; // equivalente a contador = contador +4
        contador *= 8;
        contador /= 2;

        System.out.println("Contador:" + contador);

        System.out.println("Finalizando...");

    }
}
