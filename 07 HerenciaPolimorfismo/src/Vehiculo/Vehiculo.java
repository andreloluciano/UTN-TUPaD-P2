package Vehiculo;

public class Vehiculo {

    /*Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
 Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe
mostrarInfo()
 Tarea: Instanciar un auto y mostrar su información completa.*/

    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("Vehiculo marca: " + marca +
                " modelo: " + modelo);
    }

}
