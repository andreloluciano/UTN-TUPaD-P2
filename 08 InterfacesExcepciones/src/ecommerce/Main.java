package ecommerce;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luciano");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Laptop", 1500));
        pedido.agregarProducto(new Producto("Mouse", 50));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Pago con tarjeta con descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        // Pago con PayPal (sin descuento)
        PayPal paypal = new PayPal();
        paypal.procesarPago(total);
    }
}
