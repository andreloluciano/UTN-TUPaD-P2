package cuentaBancariaTitular;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, Titular titular, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        setTitular(titular);
        this.claveSeguridad = new ClaveSeguridad (codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                ", claveSeguridad=" + claveSeguridad +
                '}';
    }
}
