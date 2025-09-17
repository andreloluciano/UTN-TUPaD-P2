package pasaporteFoto;

public class Foto {
    private String Foto;
    private String Formato;

    public Foto(String foto, String formato) {
        Foto = foto;
        Formato = formato;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String formato) {
        Formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "Foto='" + Foto + '\'' +
                ", Formato='" + Formato + '\'' +
                '}';
    }
}
