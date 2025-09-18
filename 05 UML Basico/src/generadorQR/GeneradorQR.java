package generadorQR;

public class GeneradorQR {
    void generar(String valor, Usuario usuario){
        CodigoQR q1 = new CodigoQR(valor, usuario);
        System.out.println("Se genero el QR con valor " + q1.getValor()
        + " para el usuario " + q1.getUsuario().getNombre());
    }
}
