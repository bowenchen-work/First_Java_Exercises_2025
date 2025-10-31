import java.util.Scanner;

public class PruebaTeclado {
    public static void main(String[] args) {

        //Pedimos la edad al usu y se la decimos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        System.out.println("Don/Dña tu edad es " + edad);

        //Que nota tienes en el expediente? Y te lo repetimos
        System.out.println("Tell me your exam grades");
        float nota = teclado.nextFloat();
        System.out.println("Your exam grade is " + nota);

        //del profe:
        //Pedimos la edad al usuario y se la decimos
        System.out.println("Dime tu edad,y tu altura, por favor");
        int altura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu altura es: " + altura);

        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
