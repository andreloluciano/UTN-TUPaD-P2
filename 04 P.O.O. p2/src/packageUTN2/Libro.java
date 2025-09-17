package packageUTN2;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, String editorial){
        this(titulo, autor);
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;}

    public String getAutor() {
        return autor;}

    public static String getEditorial() {
        return editorial;}

    public void setAutor(String autor) {
        this.autor = autor;}

    public void actualizarTitulo(String titulo){
        this.titulo = titulo;}

    public void actualizarTitulo(String prefijo, String titulo) {
        this.titulo = prefijo + " " + titulo;}

    public static void cambiarEditorial(String nueva) {
        Libro.editorial = nueva;}

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
