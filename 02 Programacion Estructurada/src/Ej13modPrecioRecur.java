
    /*Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.*/

    public class Ej13modPrecioRecur {

        // b. Función recursiva
        static void mostrarPrecios(double[] precios, int indice) {
            if (indice == precios.length) { // caso base
                return;
            }
            System.out.println("$" + precios[indice]); // mostrar precio
            mostrarPrecios(precios, indice + 1); // lamada recursiva
        }

        public static void main(String[] args) {

            // a
            double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

            // b
            System.out.println("Precios originales:");
            mostrarPrecios(precios, 0);

            // c
            precios[2] = 129.99;

            // d
            System.out.println("Precios modificados:");
            mostrarPrecios(precios, 0);
        }
    }




