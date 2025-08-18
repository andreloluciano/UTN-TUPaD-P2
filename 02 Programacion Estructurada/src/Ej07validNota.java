import java.util.Scanner;

/*Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.*/

public class Ej07validNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        //  do-while
        do {
            System.out.print("Ingrese una nota de 0 a 10: ");
            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);
    }
}

