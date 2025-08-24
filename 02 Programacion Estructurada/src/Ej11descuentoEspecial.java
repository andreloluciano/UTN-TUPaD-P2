import java.util.Scanner;

public class Ej11descuentoEspecial {

    /*Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.*/

    //variable global
    static double DESCUENTO_ESPECIAL = 0.10;

    static double calcularDescuentoEspecial(double precio){
        return precio * DESCUENTO_ESPECIAL;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double descuentoAplicado, valorFinal, precio;

        System.out.print("Ingrese el precio del producto: ");
        precio = teclado.nextInt();

        descuentoAplicado = calcularDescuentoEspecial(precio);
        valorFinal = precio - descuentoAplicado;

        System.out.println("El descuento aplicado es: $" + descuentoAplicado);
        System.out.println("El precio final con descuento es: $" + valorFinal);

    }

}
