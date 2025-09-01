package packageUTN;

public class NaveEspacial {
    final int TANQUE_NAVE = 100; // limite combustible
    String nombreNave = "Sin nombre";
    int combustible;

    public NaveEspacial(String nombreNave, int combustible){
        this.nombreNave = nombreNave;
        this. combustible = combustible;
    }
    public NaveEspacial(){
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombreNave + " | Combustible: " + combustible + " litros");
    }

    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombreNave + " ha despegado");
        } else {
            System.out.println("No hay suficiente combustible para despegar, tenemos" + combustible + " litros, " +
                    "necesitamos al menos 10 litros para despegar");
        }
    }
     // cada 'avanzar' consume 1l de nafta
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombreNave + " avanzo " + distancia + " km, combustible restante: " + combustible
                    + " litros");
        } else {
                System.out.println("No hay suficiente combustible para avanzar");
            }
    }
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= TANQUE_NAVE) {
            combustible += cantidad;
            System.out.println(nombreNave + " recargo " + cantidad + " litros de nafta, el tanque esta en: " + combustible
                    + " litros");
        } else {
            combustible = TANQUE_NAVE;
            System.out.println(nombreNave + " tiene el tanque lleno");
        }
    }

}
