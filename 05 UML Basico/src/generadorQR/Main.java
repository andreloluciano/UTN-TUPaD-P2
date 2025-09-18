package generadorQR;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Luciano", "Luciano@gmail.com");
        GeneradorQR g1 = new GeneradorQR();

        g1.generar("ABC$4000", u1);


    }
}
