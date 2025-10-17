package Biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Composicion, la biblioteca crea sus libros y los guarda
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor); // No viene creado de afuera
        libros.add(libro);
    }

    public void listarLibros(){
        System.out.println("Libros en: " + nombre + ":");
        for(Libro l : libros) {
            l.mostrarInfo();
        //    System.out.println(l); lo mismo?
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro encontrado = null;
        int i = 0;
        while (i < libros.size() && encontrado == null) {
            Libro l = libros.get(i);
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                encontrado = l;
            }
            i++;
        }
    return encontrado;
    }

    public Libro eliminarLibro(String isbn){
        Libro borrado = buscarLibroPorIsbn(isbn);
        if(borrado != null){
            libros.remove(borrado);
        }
        return borrado;
    }

    public int obtenerCantidadLibros(){
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio){
        for(Libro l : libros){
            if(l.getAnioPublicacion() == anio){
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles(){
        Set<String> autores = new HashSet<>();  // Uso Set para no mostrar repetidos
            for (Libro l : libros){
                autores.add(l.getAutor().toString());
            }
        System.out.println("Autores disponibles: ");
            for(String s : autores){
                System.out.println("- " + s);
            }

    }


}
