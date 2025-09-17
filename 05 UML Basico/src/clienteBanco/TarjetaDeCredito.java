package clienteBanco;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        setBanco(banco);
        setCliente(cliente);
    }

    public String getNumero() {return numero;}

    public void setNumero(String numero) {this.numero = numero;}

    public String getFechaVencimiento() {return fechaVencimiento;}

    public void setFechaVencimiento(String fechaVencimiento) {this.fechaVencimiento = fechaVencimiento;}

    public Banco getBanco() {return banco;}

    public void setBanco(Banco banco) {this.banco = banco;}

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", banco=" + banco +
                ", cliente=" + cliente +
                '}';
    }
}
