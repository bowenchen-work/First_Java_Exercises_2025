package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        int numDni = 0;
        int dniLetter = 0;

        int numNie = 0;
        int letANie = 0;
        int digitNie = 0;
        int let_digit_Nie = 0;
        String letNie = "";

        int dni_t = 0;
        int dni_r = 1;
        int dni_w = 2;
        int dni_a = 3;
        int dni_g = 4;
        int dni_m = 5;
        int dni_y = 6;
        int dni_f = 7;
        int dni_p = 8;
        int dni_d = 9;
        int dni_x = 10;
        int dni_b = 11;
        int dni_n = 12;
        int dni_j = 13;
        int dni_z = 14;
        int dni_s = 15;
        int dni_q = 16;
        int dni_v = 17;
        int dni_h = 18;
        int dni_l = 19;
        int dni_c = 20;
        int dni_k = 21;
        int dni_e = 22;

        System.out.println("Tienes DNI o NIE? Escribe DNI o NIE dependiendo de lo que tengas:");
        opcion = teclado.nextLine();

        switch (opcion) {

            //DESDE AQUI LA SECCION DE DNI

            case "DNI":
                System.out.println("Ahora dime los digitos de su DNI por favor:");
                numDni = teclado.nextInt();
                dniLetter = numDni % 23;

                break;

                //DESDE AQUI LA SECCION DE NIE
                //PEDIMOS AL USUARIO QUE NOS DE SU PRIMERA LETRA PARA PODER CONVERTIRLO A NUMERO PARA POSTERIORI:

                case "NIE":
                System.out.println("Ahora dime primero solo la primera letra de su NIE por favor:");
                letNie = teclado.nextLine();
                if (letNie == "x" || letNie == "X" || letNie == "y" || letNie == "Y" || letNie == "z" || letNie == "Z") {
                    System.out.println("Perdona lo que has introducido no es valido...");
                } else {
                    if (letNie == "x" || letNie == "X") {
                        letANie = 0;
                    } else if (letNie == "y" || letNie == "Y") {
                        letANie = 1;
                    } else if (letNie == "z" || letNie == "Z") {
                        letANie = 2;
                    }
                }

                //LE PEDIMOS AHORA LOS DIGITOS SIN LA ULTIMA LETRA QUE ES LA QUE VAMOS A CALCULAR:

                System.out.println("Ahora escribeme los digitos de tu NIE sin la última letra, por favor:");
                digitNie = teclado.nextInt();

                //AHORA CALCULAMOS LA ULTIMA LETRA Y SE LA ENSEÑAMOS:
                if (digitNie < 0){
                    System.out.println("Lo siento, no permitimos ese tipo de inputs.");
                } else {
                    let_digit_Nie = letANie + digitNie;
                }

        }

        /*
        int numUsu = 0;
        String doc = "";
        int numDni = 0;
        int numNie = 0;
        int dniLetter = 0;

        System.out.println("Tienes DNI o NIE? Escribe DNI o NIE dependiendo de lo que tengas:");
        doc = teclado.nextLine();

        if (doc == "DNI"){
            System.out.println("Ahora dime los digitos de su DNI por favor:");
            numDni = teclado.nextInt();
            dniLetter = numDni % 23;

        } else if (doc == "NIE") {

        }

         */
    }
}
