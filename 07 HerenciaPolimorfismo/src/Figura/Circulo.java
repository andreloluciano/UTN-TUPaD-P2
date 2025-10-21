package Figura;

public class Circulo extends Figura{

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    double calcularArea(){
        return 2 * this.radio * Math.PI;
    }

}
