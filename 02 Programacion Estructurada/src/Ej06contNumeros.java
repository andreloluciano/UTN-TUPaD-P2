import java.util.Scanner;

/* Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.*/

public class Ej06contNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicializamos contadores
        int numero = 0, positivos = 0, negativos = 0, ceros = 0;
        // Pedimos 10 números al usuario
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = teclado.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
}
