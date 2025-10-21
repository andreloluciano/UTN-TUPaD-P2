package Figura;

import java.util.ArrayList; // importar la clase ArrayList

public class Main {
    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo("Rectangulo", 6, 7));
        figuras.add(new Circulo("Circulo", 3));

        for (Figura f : figuras) {
            f.mostrarInfo();
            System.out.println("Area: " + f.calcularArea());
        }
    }
}

