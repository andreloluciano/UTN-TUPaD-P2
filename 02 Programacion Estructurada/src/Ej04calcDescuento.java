import java.util.Scanner;
    /*Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C). */

public class Ej04calcDescuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precio, descuento = 0.0, montoDescuento, precioFinal;
        String categoria;

        // pedimos datos
        System.out.println("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Ingrese la categoria del producto (A, B o C): ");
        categoria = teclado.nextLine().toUpperCase();

        // condicional
        if (categoria.equals("A")) {
            descuento = 0.10;
        } else if (categoria.equals("B")) {
            descuento = 0.15;
        } else if (categoria.equals("C")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoria Invalida");
        }

        // Calculos
        montoDescuento = precio * descuento;
        precioFinal = precio - montoDescuento;

        // Resultados
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + (descuento * 100) + "%");
        System.out.println("Monto de descuento: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);



    }
}
