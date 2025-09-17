package clienteBanco;

public class Main {
    public static void main(String[] args) {

       Banco b1 = new Banco("Galicia", "2044022293");
       Cliente c1 = new Cliente("Luciano", "36686873");
       TarjetaDeCredito tc1 = new TarjetaDeCredito("4660244045659023", "21/11/2029");

       tc1.setBanco(b1);
       tc1.setCliente(c1);

        System.out.println(tc1);
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(tc1.getCliente().getNombre());
        System.out.println(c1.getTarjetaDeCredito().getNumero());
        System.out.println(tc1.getBanco().getNombre());

    }
}
