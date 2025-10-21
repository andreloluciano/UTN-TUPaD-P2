package Figura;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularArea();

    void mostrarInfo(){
        System.out.println("Esto es una figura llamada: " + nombre);
    }


}
