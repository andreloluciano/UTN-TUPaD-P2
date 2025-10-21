package Empleado;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo(){
        System.out.println("Empleado: " + nombre);
    }
}
