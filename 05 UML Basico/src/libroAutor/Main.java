package libroAutor;

public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Gabriel Marquez", "Colombiana");
        Editorial e1 = new Editorial("Tolkien Productions", "Buenos Aires");
        Libro l1 = new Libro("Transformers 15", "156-223-114", a1, e1);

        System.out.println(l1);
        System.out.println(l1.getAutor().getNombre());
        System.out.println(l1.getEditorial().getNombre());
        System.out.println(l1.getTitulo());


    }
}
