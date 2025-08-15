import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int birthday, date, age;
        date = 2023;

        System.out.println("Ingrese su año de nacimiento ");
        birthday = Integer.parseInt(input.nextLine());

        age = date - birthday;

        System.out.println("Su edad es " + age + " años");

    }

}
