import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Se realizará suma, resta, multiplicacion y division de los numeros que ingrese: ");
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2) );
        System.out.println("Resta: " + (num1 - num2) );
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

    }
}
