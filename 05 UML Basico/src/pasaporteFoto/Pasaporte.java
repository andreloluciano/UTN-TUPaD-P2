package pasaporteFoto;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
    }

    public Pasaporte(String numero, String fechaEmision, String archivoFoto, String formatoFoto) {
        this(numero, fechaEmision);
        this.foto = new Foto(archivoFoto, formatoFoto);
    }


    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);   // asegura bidireccionalidad
        }
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", titular=" + titular +
                ", foto=" + foto +
                '}';
    }
}
