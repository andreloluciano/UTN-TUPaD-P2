package computadoraPropietario;

public class Main {
    public static void main(String[] args) {

        Propietario p1 = new Propietario("Luciano", "40123456");
        Computadora c1 = new Computadora("Dell", "ABC123", p1, "Z790", "Intel");

        System.out.println(c1);
        System.out.println(p1);
        System.out.println(c1.getPlacaMadre());
        System.out.println(p1.getComputadora().getMarca());


    }
}
