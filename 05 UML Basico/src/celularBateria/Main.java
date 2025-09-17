package celularBateria;

public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("456123", "Motorola", "Edge");
        Bateria b1 = new Bateria("EB-BG950ABA", "3000 mAh");
        Usuario u1 = new Usuario("Luciano", "40123456");

        // Relacion celular bateria
        c1.setBateria(b1);

        // Relacion bidireccional Celular Usuario
        c1.setUsuario(u1);
        // o tambien u1.setCelular(c1)

        // mostrar datos
        System.out.println(c1);
        System.out.println(u1);
        System.out.println(b1);

        // cruzamos accesos para verificar asociacion
        System.out.println(c1.getUsuario().getNombre()); // desde celular llego al usuario
        System.out.println(u1.getCelular().getMarca()); // desde usuario llego al celular
        System.out.println(c1.getBateria().getModelo()); // desde celular llego a bateria

    }
}
