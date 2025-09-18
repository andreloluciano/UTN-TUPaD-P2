package reproducirCancion;

public class Main {
    public static void main(String[] args) {

        Artista a1 = new Artista("Killswitch Engage", "Rock");
        Cancion c1 = new Cancion("My Curse", a1);
        Reproductor r1 = new Reproductor();

        r1.reproducir(c1);

    }
}
