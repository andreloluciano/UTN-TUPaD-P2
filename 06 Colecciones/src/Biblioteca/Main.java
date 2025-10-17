package Biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Central");

        Autor a1 = new Autor("A001", "Gabriel García Marquez", "Colombiano");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Britanica");
        Autor a3 = new Autor("A003", "Julio Verne", "Frances");

        biblio.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblio.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblio.agregarLibro("ISBN003", "Harry Potter y la cámara secreta", 1998, a2);
        biblio.agregarLibro("ISBN004", "Viaje al centro de la Tierra", 1864, a3);
        biblio.agregarLibro("ISBN005", "La vuelta al mundo en 80 días", 1873, a3);


        System.out.println("=== Listado de Libros ===");
        biblio.listarLibros();

        System.out.println("=== Buscar Por ISBN ===");
        Libro encontrado = biblio.buscarLibroPorIsbn("ISBN002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontro el libro");
        }

        System.out.println("=== Eliminar por ISBN ===");
        Libro borrado = biblio.eliminarLibro("ISBN001");
        if(borrado != null) {
            System.out.println("Libro eliminado: " + borrado);
        }else {
            System.out.println("No se encontro el libro a eliminar");
        }
        biblio.listarLibros();

        System.out.println("=== Cantidad total de libros ===");
        System.out.println(biblio.obtenerCantidadLibros());

        System.out.println("=== Autores disponibles ===");
        biblio.mostrarAutoresDisponibles();


    }
}


