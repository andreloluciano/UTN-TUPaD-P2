package computadoraPropietario;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, Propietario propietario, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        setPropietario(propietario);
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario p) {
        this.propietario = p;
        if (p != null && p.getComputadora() != this) {
            p.setComputadora(this);
        }
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
