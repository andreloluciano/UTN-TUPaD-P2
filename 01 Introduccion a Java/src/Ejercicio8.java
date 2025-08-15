import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextDouble();

        resultado = num1 / num2;
        System.out.println("Division de los numeros: " + resultado);

    }
}