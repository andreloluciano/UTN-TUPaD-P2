package cuentaBancariaTitular;

public class Main {
    public static void main(String[] args) {

        Titular t1 = new Titular ("Luciano", "38986345");
        CuentaBancaria c1 = new CuentaBancaria("67891234678", 50000, t1, "123456",
                "25-09-2025");

        System.out.println(c1);
        System.out.println(c1.getClaveSeguridad());
        System.out.println(c1.getTitular());
        System.out.println(t1.getCuentaBancaria().getCbu());

    }
}
