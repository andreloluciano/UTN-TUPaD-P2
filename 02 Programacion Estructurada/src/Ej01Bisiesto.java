import java.util.Scanner;

public class Ej01Bisiesto {

           /* Escribe un programa en Java que solicite al usuario un año y determine si es
        bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        divisible por 400. */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int year;

        // Pedimos año al usuario
        System.out.println("Ingrese un año y veremos si es bisiesto");
        year = teclado.nextInt();

        // Se verifica si es bisiesto
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto");

        } else {
            System.out.println(year + " no es un año bisiesto");
        }



    }



}
