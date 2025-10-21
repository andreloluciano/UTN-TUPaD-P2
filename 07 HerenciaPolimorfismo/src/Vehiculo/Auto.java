package Vehiculo;

public class Auto extends Vehiculo{
    int cantPuertas;

    public Auto(String modelo, String marca, int cantPuertas) {
        super(modelo, marca);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Vehiculo marca: " +marca +
                ". Modelo: " + modelo +
                ". Cantidad de puertas: " + cantPuertas);
    }
}
