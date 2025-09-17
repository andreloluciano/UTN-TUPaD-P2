package pasaporteFoto;

public class Main {
    public static void main(String[] args) {

    Pasaporte p1 = new Pasaporte("AR-123456", "01-09-2025", "foto.png", "PNG");
    Titular t1 = new Titular("Luciano", "25659665");

        System.out.println(p1);
        System.out.println(t1);
        System.out.println(p1.getFoto());
    }
}

