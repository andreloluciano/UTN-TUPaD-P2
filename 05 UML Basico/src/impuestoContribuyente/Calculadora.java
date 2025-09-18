package impuestoContribuyente;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("El contribuyente " + impuesto.getContribuyente().getNombre() + ", CUIL "
        + impuesto.getContribuyente().getCuil() + " debe $" + impuesto.getMonto() + " de impuestos");

    }
}
