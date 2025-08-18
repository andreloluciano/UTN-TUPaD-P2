import java.util.Scanner;

public class Ej03clasEdad {
    // constantes
    final static int LIMITE_NINIO = 12;
    final static int LIMITE_ADOLESCENTE = 18;
    final static int LIMITE_ADULTO = 60;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else if (edad < LIMITE_NINIO) {
            System.out.println("Etapa de vida: Niño");
        } else if (edad < LIMITE_ADOLESCENTE) {
            System.out.println("Etapa de vida: Adolescente");
        } else if (edad < LIMITE_ADULTO) {
            System.out.println("Etapa de vida: Adulto");
        } else {
            System.out.println("Etapa de vida: Adulto mayor");
        }

    }
}
