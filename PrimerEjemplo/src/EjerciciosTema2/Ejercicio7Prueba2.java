package EjerciciosTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7Prueba2 {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);

        int tipoDocumentacion = 0;
        int primeraLetraNie = 0;

        int numDni = 0;
        int numNie = 0;

        int ultimaLetraDni = 0;
        int ultimaLetraNie = 0;

        char letter_T = 84;
        char letter_R = 82;
        char letter_W = 87;
        char letter_A = 65;
        char letter_G = 71;
        char letter_M = 77;
        char letter_Y = 89;
        char letter_F = 70;
        char letter_P = 80;
        char letter_D = 68;
        char letter_X = 88;
        char letter_B = 66;
        char letter_N = 78;
        char letter_J = 74;
        char letter_Z = 90;
        char letter_S = 83;
        char letter_Q = 81;
        char letter_V = 86;
        char letter_H = 72;
        char letter_L = 76;
        char letter_C = 67;
        char letter_K = 75;
        char letter_E = 69;

        System.out.println("Dime, tienes DNI o NIE? Escribe 1 para DNI o 2 para NIE:");
        tipoDocumentacion = teclado.nextInt();

        switch (tipoDocumentacion){
            case 1:
                System.out.println("Ahora te genero 8 digitos aleatorios del DNI para que mires que letra le corresponde.");

                for (int cont = 1; cont <= 8; cont++) {
                    int numRandom = generador.nextInt(0, 10);
                    System.out.print(numRandom);
                }
                System.out.println("\nIntruduce el DNI generado por favor:");
                numDni = teclado.nextInt();

                ultimaLetraDni = numDni % 23;

                if (ultimaLetraDni == 0){
                    System.out.println("Su DNI completo es: " + numDni + letter_T);
                } else if (ultimaLetraDni == 1) {
                    System.out.println("Su DNI completo es: " + numDni + letter_R);
                } else if (ultimaLetraDni == 2) {
                    System.out.println("Su DNI completo es: " + numDni + letter_W);
                } else if (ultimaLetraDni == 3) {
                    System.out.println("Su DNI completo es: " + numDni + letter_A);
                } else if (ultimaLetraDni == 4) {
                    System.out.println("Su DNI completo es: " + numDni + letter_G);
                } else if (ultimaLetraDni == 5) {
                    System.out.println("Su DNI completo es: " + numDni + letter_M);
                } else if (ultimaLetraDni == 6) {
                    System.out.println("Su DNI completo es: " + numDni + letter_Y);
                } else if (ultimaLetraDni == 7) {
                    System.out.println("Su DNI completo es: " + numDni + letter_F);
                } else if (ultimaLetraDni == 8) {
                    System.out.println("Su DNI completo es: " + numDni + letter_P);
                } else if (ultimaLetraDni == 9) {
                    System.out.println("Su DNI completo es: " + numDni + letter_D);
                } else if (ultimaLetraDni == 10) {
                    System.out.println("Su DNI completo es: " + numDni + letter_X);
                } else if (ultimaLetraDni == 11) {
                    System.out.println("Su DNI completo es: " + numDni + letter_B);
                } else if (ultimaLetraDni == 12) {
                    System.out.println("Su DNI completo es: " + numDni + letter_N);
                } else if (ultimaLetraDni == 13) {
                    System.out.println("Su DNI completo es: " + numDni + letter_J);
                } else if (ultimaLetraDni == 14) {
                    System.out.println("Su DNI completo es: " + numDni + letter_Z);
                } else if (ultimaLetraDni == 15) {
                    System.out.println("Su DNI completo es: " + numDni + letter_S);
                } else if (ultimaLetraDni == 16) {
                    System.out.println("Su DNI completo es: " + numDni + letter_Q);
                } else if (ultimaLetraDni == 17) {
                    System.out.println("Su DNI completo es: " + numDni + letter_V);
                } else if (ultimaLetraDni == 18) {
                    System.out.println("Su DNI completo es: " + numDni + letter_H);
                } else if (ultimaLetraDni == 19) {
                    System.out.println("Su DNI completo es: " + numDni + letter_L);
                } else if (ultimaLetraDni == 20) {
                    System.out.println("Su DNI completo es: " + numDni + letter_C);
                } else if (ultimaLetraDni == 21) {
                    System.out.println("Su DNI completo es: " + numDni + letter_K);
                } else if (ultimaLetraDni == 22) {
                    System.out.println("Su DNI completo es: " + numDni + letter_E);
                }
                break;
            case 2:
                System.out.println("Escribe 1 si empieza por X, 2 si empieza por Y o 3 s empieza por Z.");
                primeraLetraNie = teclado.nextInt();

                System.out.println("Ahora te genero 8 digitos aleatorios del NIE para que mires que letra le corresponde al final.");
                System.out.println("La primera letra de su NIE se convierte en su numero correspondiente al principio de los numeros generados.");
                switch (primeraLetraNie) {
                    case 1:
                        for (int cont = 1; cont < 8; cont++) {
                            int numRandom = generador.nextInt(0,10);
                            System.out.print(numRandom);
                        }
                        System.out.println("\nIntruduce el NIE generado por favor:");
                        numNie = teclado.nextInt();

                        ultimaLetraNie = numNie % 23;

                        if (ultimaLetraNie == 0){
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_T);
                        } else if (ultimaLetraNie == 1) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_R);
                        } else if (ultimaLetraNie == 2) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_W);
                        } else if (ultimaLetraNie == 3) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_A);
                        } else if (ultimaLetraNie == 4) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_G);
                        } else if (ultimaLetraNie == 5) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_M);
                        } else if (ultimaLetraNie == 6) {
                            System.out.println("Su NIE completo es: " + letter_X + numDni + letter_Y);
                        } else if (ultimaLetraNie == 7) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_F);
                        } else if (ultimaLetraNie == 8) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_P);
                        } else if (ultimaLetraNie == 9) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_D);
                        } else if (ultimaLetraNie == 10) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_X);
                        } else if (ultimaLetraNie == 11) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_B);
                        } else if (ultimaLetraNie == 12) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_N);
                        } else if (ultimaLetraNie == 13) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_J);
                        } else if (ultimaLetraNie == 14) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_Z);
                        } else if (ultimaLetraNie == 15) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_S);
                        } else if (ultimaLetraNie == 16) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_Q);
                        } else if (ultimaLetraNie == 17) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_V);
                        } else if (ultimaLetraNie == 18) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_H);
                        } else if (ultimaLetraNie == 19) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_L);
                        } else if (ultimaLetraNie == 20) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_C);
                        } else if (ultimaLetraNie == 21) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_K);
                        } else if (ultimaLetraNie == 22) {
                            System.out.println("Su NIE completo es: " + letter_X + numNie + letter_E);
                        }
                        break;
                    case 2:
                        for (int cont = 1; cont < 8; cont++) {
                            int numRandom = generador.nextInt(0,10);
                            System.out.print(numRandom);
                        }
                        System.out.println("\nIntruduce el NIE generado por favor:");
                        numNie = teclado.nextInt();

                        ultimaLetraNie = numNie % 23;

                        if (ultimaLetraNie == 0){
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_T);
                        } else if (ultimaLetraNie == 1) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_R);
                        } else if (ultimaLetraNie == 2) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_W);
                        } else if (ultimaLetraNie == 3) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_A);
                        } else if (ultimaLetraNie == 4) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_G);
                        } else if (ultimaLetraNie == 5) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_M);
                        } else if (ultimaLetraNie == 6) {
                            System.out.println("Su NIE completo es: " + letter_Y + numDni + letter_Y);
                        } else if (ultimaLetraNie == 7) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_F);
                        } else if (ultimaLetraNie == 8) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_P);
                        } else if (ultimaLetraNie == 9) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_D);
                        } else if (ultimaLetraNie == 10) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_X);
                        } else if (ultimaLetraNie == 11) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_B);
                        } else if (ultimaLetraNie == 12) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_N);
                        } else if (ultimaLetraNie == 13) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_J);
                        } else if (ultimaLetraNie == 14) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_Z);
                        } else if (ultimaLetraNie == 15) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_S);
                        } else if (ultimaLetraNie == 16) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_Q);
                        } else if (ultimaLetraNie == 17) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_V);
                        } else if (ultimaLetraNie == 18) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_H);
                        } else if (ultimaLetraNie == 19) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_L);
                        } else if (ultimaLetraNie == 20) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_C);
                        } else if (ultimaLetraNie == 21) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_K);
                        } else if (ultimaLetraNie == 22) {
                            System.out.println("Su NIE completo es: " + letter_Y + numNie + letter_E);
                        }
                        break;
                    case 3:
                        for (int cont = 1; cont < 8; cont++) {
                            int numRandom = generador.nextInt(0,10);
                            System.out.print(numRandom);
                        }
                        System.out.println("\nIntruduce el NIE generado por favor:");
                        numNie = teclado.nextInt();
                        ultimaLetraNie = numNie % 23;

                        if (ultimaLetraNie == 0){
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_T);
                        } else if (ultimaLetraNie == 1) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_R);
                        } else if (ultimaLetraNie == 2) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_W);
                        } else if (ultimaLetraNie == 3) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_A);
                        } else if (ultimaLetraNie == 4) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_G);
                        } else if (ultimaLetraNie == 5) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_M);
                        } else if (ultimaLetraNie == 6) {
                            System.out.println("Su NIE completo es: " + letter_Z + numDni + letter_Y);
                        } else if (ultimaLetraNie == 7) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_F);
                        } else if (ultimaLetraNie == 8) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_P);
                        } else if (ultimaLetraNie == 9) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_D);
                        } else if (ultimaLetraNie == 10) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_X);
                        } else if (ultimaLetraNie == 11) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_B);
                        } else if (ultimaLetraNie == 12) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_N);
                        } else if (ultimaLetraNie == 13) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_J);
                        } else if (ultimaLetraNie == 14) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_Z);
                        } else if (ultimaLetraNie == 15) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_S);
                        } else if (ultimaLetraNie == 16) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_Q);
                        } else if (ultimaLetraNie == 17) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_V);
                        } else if (ultimaLetraNie == 18) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_H);
                        } else if (ultimaLetraNie == 19) {
                            System.out.println("Su NIE completo es: " + letter_Z+ numNie + letter_L);
                        } else if (ultimaLetraNie == 20) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_C);
                        } else if (ultimaLetraNie == 21) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_K);
                        } else if (ultimaLetraNie == 22) {
                            System.out.println("Su NIE completo es: " + letter_Z + numNie + letter_E);
                        }
                        break;
                    default:
                        System.out.println("Texto no valido.");
                        break;
                }
                break;
            default:
                System.out.println("El texto que has introducido no es valido.");
        }
    }
}
