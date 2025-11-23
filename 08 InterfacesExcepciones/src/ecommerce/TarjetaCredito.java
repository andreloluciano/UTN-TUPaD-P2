package ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; // 10% de descuento
        return monto - descuento;
    }
}

