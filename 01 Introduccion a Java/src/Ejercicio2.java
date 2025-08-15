import java.util.Scanner;
// Ejercicio Cimino 2
public class Ejercicio2 {

    final static int CANT_PASADAS = 3;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ancho, largo, superficie, perimetro, cantAlambre;
        double precioM2, valorTerreno;

        System.out.println("Ingrese el ancho del terreno ");
        ancho = Integer.parseInt( input.nextLine() );

        System.out.println("Ingrese el largo del terreno ");
        largo = Integer.parseInt( input.nextLine() );

        System.out.println("Ingrese el valor del M2: ");
        precioM2 = Double.parseDouble(input.nextLine() );

        superficie = ancho * largo;
        valorTerreno = superficie * precioM2;

        perimetro = (2 * ancho) + (2 * largo);
        cantAlambre = perimetro * CANT_PASADAS;

    System.out.println("El valor del terreno es de " + valorTerreno + "USD");
    System.out.println("La cantidad de alambre para " + CANT_PASADAS + " pasadas es de " + cantAlambre + " m");

    }

}
