package reproducirCancion;

public class Reproductor {

    void reproducir (Cancion cancion){
        System.out.println("Reproduciento " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}
