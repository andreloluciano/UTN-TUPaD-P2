import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre; // Declaracion
        String apellido; // Declaracion
        double estatura; // Declaracion
        boolean estudiante = true; // Declaracion y asignacion

        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();

        System.out.println("Ingresa tu apellido");
        apellido = input.nextLine();

        int edad; // declaracion
        edad = 33; // asignacion

        System.out.print("Ingresa tu estatura en cm ");
        estatura = input.nextInt();

        System.out.println("Hola " + nombre + " " + apellido + " ,Tienes " + edad + " años");
        System.out.println("Mides " + estatura + "cm");
        System.out.println("Eres estudiante: " + estudiante);
    }
}