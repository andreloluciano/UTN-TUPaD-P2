package Vehiculo;

public class Main {
    public static void main(String[] args) {

        // sin upcasting
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        // con upcasting
        Vehiculo vehiculo = new Auto("Ford", "Focus", 5);
        vehiculo.mostrarInfo(); // ejecuta el metodo de Auto igual
    }
}

