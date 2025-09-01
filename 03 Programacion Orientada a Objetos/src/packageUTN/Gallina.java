package packageUTN;

public class Gallina {
    int idGallina, edad = 0, huevosPuestos;

    public Gallina (int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    public Gallina (){
    }

public void ponerHuevo(){
        this.huevosPuestos++;
    }

public void envejecer(){
        this.edad++;
    }

public void mostrarEstado(){
    System.out.println("La gallina con ID " + idGallina + " ha puesto " + huevosPuestos + " huevos, y tiene " + edad + " años");
    }
}
