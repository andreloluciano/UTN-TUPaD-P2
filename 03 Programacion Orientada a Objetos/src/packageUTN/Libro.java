package packageUTN;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

public Libro (String titulo, String autor, int anioPublicacion){
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
}
public Libro(){
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año invalido");
        }
    }
}
