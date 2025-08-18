import java.util.Scanner;

/*Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.*/

public class Ej05sumPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = -1;
        int sumPares = 0;

        while (numero != 0) {
            System.out.print("Ingrese un número, se sumaran solo los numeros pares (0 para salir): ");
            numero = teclado.nextInt();

            // condicional
            if (numero % 2 == 0 && numero != 0) {
                sumPares += numero;
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumPares);

    }
}

