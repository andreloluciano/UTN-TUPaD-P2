public class Ej12modifPrecio {
    /*Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados. */

    public static void main(String[] args) {

        // a
        double [] precios = {199.99, 299.5, 149.75, 399, 89.99};

        // b
        System.out.println("Precios Originales: ");
        for (double precio : precios) {
            System.out.println("$" + precio);
        }

        // c
        precios[0] = 175.50;
        precios[1] = 245;

        System.out.println("Precios modificados: ");
        for (double precio : precios) {
            System.out.println("$" + precio);
        }
    }
}
