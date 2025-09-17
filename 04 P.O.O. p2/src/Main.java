import packageUTN2.Empleado;
import packageUTN2.Libro;

import static packageUTN2.Empleado.mostrarTotalEmpleados;

public class Main {
    public static void main(String[] args) {

    Empleado e1 = new Empleado("Luciano", "Datos", 4000);
    Empleado e2 = new Empleado("Facundo", "FrontEnd");

        System.out.println("Salario de " + e1.getNombre() + ": " + e1.getSalario());
             e1.actualizarSalario(40.5);
        System.out.println("Salario de " + e1.getNombre() + " aumentado: " + e1.getSalario());

        System.out.println("Salario de " + e2.getNombre() + ": " + e2.getSalario());
            e2.actualizarSalario(20000);
        System.out.println("Salario de " + e2.getNombre() + " aumentado: " + e2.getSalario());

        System.out.println("El ID de " + e1.getNombre() + " es : " + e1.getId());
        System.out.println("El ID de " + e2.getNombre() + " es : " + e2.getId());
        System.out.println("El total de empleados es: " + mostrarTotalEmpleados());

        System.out.println(e1);
        System.out.println((e2));

        System.out.println("_____________________________________________");

    Libro l1 = new Libro("Señor Anillos", "Tolkien");
        System.out.println(l1.getTitulo() + " " + l1.getAutor() + " " + Libro.getEditorial() );
    Libro l2 = new Libro("Harry Potter", "Samuel", "Wizzards");
        System.out.println(l2.getTitulo() + " " + l2.getAutor() + " " + Libro.getEditorial() );

    l1.actualizarTitulo("El Señor de los Anillos");
        System.out.println(l1.getTitulo());

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("_____________________________________________");


    }
}