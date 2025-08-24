import java.util.Scanner;

/*Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.*/

public class Ej08precioFinal {

    // funcion que calcula el precio final
     static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100; // convierte el descuento o impuesto a decimal (10 a 0.10 o 0.05)
        double resultado = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return resultado; // devuelve el precio final
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaración  de variables
        double precioBase, impuesto, descuento, total;

        // ingreso de datos
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = teclado.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = teclado.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = teclado.nextDouble();

        // Llamada a la función
        total = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + total);


    }
}

