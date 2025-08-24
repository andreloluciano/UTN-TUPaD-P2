import java.util.Scanner;

public class Ej10actualizarStock {

    /*Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.*/

    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;

        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = teclado.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = teclado.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = teclado.nextInt();

        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }
}
