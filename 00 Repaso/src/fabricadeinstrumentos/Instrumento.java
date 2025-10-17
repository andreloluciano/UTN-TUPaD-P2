package fabricadeinstrumentos;

public class Instrumento {

    private String ID;
    private double Precio;
    private TipoInstrumento tipo;

    public Instrumento(String ID, double precio, TipoInstrumento tipo) {
        this.ID = ID;
        Precio = precio;
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public TipoInstrumento getTipo() {return tipo;}

    @Override
    public String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", Precio=" + Precio +
                ", tipo=" + tipo +
                '}';
    }
}
