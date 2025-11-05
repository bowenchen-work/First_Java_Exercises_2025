package PrimerContactoJava;

import java.util.Scanner;

public class EjercicioTipoClientes {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Corte Inglés");
        System.out.println("Dime tu nombre, luego el nº de compras, " +
                "y luego el precio base del producto. " +
                "Calcularé descuentos según tu tipo de cliente");
        Scanner teclado = new Scanner(
                System.in
        );
        String nombre = teclado.nextLine();
        int numCompras = teclado.nextInt();
        float precioProducto = teclado.nextFloat();

        String tipoCliente = null;
        if(numCompras >= 20){
            tipoCliente = "PLATINO";
        }else if(numCompras >= 10){
            tipoCliente = "ORO";
        }else if(numCompras >= 5){
            tipoCliente = "BRONCE";
        }else{
            tipoCliente = "NORMAL";
        }


        float porcDescuento = 0;
        float precioFinalProducto = 0;

        /*
        switch (tipoCliente){
            case "PLATINO":
                porcDescuento = 15;
                break;
            case "ORO":
                porcDescuento = 8;
                break;
            case "BRONCE":
                porcDescuento = 5;
                break;
            default:
                porcDescuento = 0;
        }*/

        //switch mejorado

        porcDescuento = switch (tipoCliente) {
            case "PLATINO" -> 15;
            case "ORO" -> 8;
            case "BRONCE" -> 5;
            default -> 0;
        };

        if(porcDescuento != 0){
            precioFinalProducto = precioProducto - (precioProducto * porcDescuento / 100);
        }else{
            precioFinalProducto = precioProducto;
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de cliente (según compras): " + tipoCliente);
        if(porcDescuento == 0){
            System.out.println("(no aplica descuento al producto)");
            System.out.println("Haz más compras, RATA!");
        }
        System.out.println("Precio final producto: " + precioFinalProducto);
    }
}
