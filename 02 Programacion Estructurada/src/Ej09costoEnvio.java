import java.util.Scanner;

    /*a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar. */

public class Ej09costoEnvio {

    // funciones
    // a) Costo de envío segun zona y peso
   static double calcularCostoEnvio(double peso, String zona) {
        double tarifaNacional = 5;
        double tarifaInternacional = 10;

        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * tarifaNacional;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * tarifaInternacional;
        } else {
            System.out.println("Zona invalida, se asumira costo 0.");
            return 0;
        }
    }

    // b) producto + envío
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaramos variables
        double precioProducto, peso, costo, total;
        String zona;

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = teclado.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = teclado.nextLine();

        // validacion
        if (precioProducto < 0 || peso < 0) {
            System.out.println("Error: precio y peso deben ser positivos.");

        }

        costo = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precioProducto, costo);

        System.out.println("El costo de envío es: " + costo);
        System.out.println("El total a pagar es: " + total);


    }
}

