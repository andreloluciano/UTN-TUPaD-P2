package Figura;

public class Rectangulo extends Figura{

    double largo;
    double ancho;

    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    double calcularArea(){
        return largo * ancho;
    }


}
