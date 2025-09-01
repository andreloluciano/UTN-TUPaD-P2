import packageUTN.*;

public class Main {
    public static void main(String[] args) {

    Estudiante alumno1 = new Estudiante("Luciano", "Andrelo", "Programacion 2", 7.4);

    // info inicial
    alumno1.mostrarInfo();

    // calificaciones
    alumno1.subirCalificacion(1.3);
        System.out.println("Calificacion subida: " + alumno1.getCalificacion());
    alumno1.bajarCalificacion(2.3);
        System.out.println("Calificacion bajada: " + alumno1.getCalificacion());
        System.out.println("______________________________________");

    Mascota perro = new Mascota("Firulais", "perro", 3);

    perro.mostrafInfo();
    perro.cumplirAnios();
        System.out.println("______________________________________");

        Libro libro1 = new Libro("Metro 2033", "Dimitri Glukovsky", 2010);
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println(("Autor: " + libro1.getAutor()));
        System.out.println("Año publicado: " + libro1.getAnioPublicacion());

        // comprobando validacion
        libro1.setAnioPublicacion(-100);
        libro1.setAnioPublicacion((2500));
        libro1.setAnioPublicacion(2025);
        System.out.println("Año publicado: " + libro1.getAnioPublicacion());
        System.out.println("______________________________________");

    Gallina g1 = new Gallina (1, 2, 5);
    Gallina g2 = new Gallina(2, 1, 0);

    g1.ponerHuevo();
    g1.envejecer();

    g2.ponerHuevo();
    g2.ponerHuevo();
    g2.envejecer();

    g1.mostrarEstado();
    g2.mostrarEstado();
        System.out.println("______________________________________");

        NaveEspacial nave1 = new NaveEspacial("Quattro", 50);

        nave1.mostrarEstado();

        nave1.avanzar(60);
        nave1.recargarCombustible((40));
        nave1.despegar();
        nave1.avanzar(30);
        nave1.mostrarEstado();


    }
}
