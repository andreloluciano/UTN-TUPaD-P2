package reservaCliente;

public class Main {
    public static void main(String[] args) {
    Cliente c1 = new Cliente("Luciano", "1532435467");
    Mesa m1 = new Mesa (4, 2);
    Reserva r1 = new Reserva ("27/09/2025", "20:30", c1, m1);

        System.out.println(r1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(r1.getCliente().getNombre());
        System.out.println(r1.getMesa().getNumero());

    }
}
