package packageUTN;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota (String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    public Mascota(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

public void mostrafInfo(){
    System.out.println("Nombre de la mascota: " + this.nombre);
    System.out.println("Especia: " + this.especie);
    System.out.println("Edad: " + this.edad + " años");
}

public void cumplirAnios(){
        this.edad++;
    System.out.println(this.nombre + " ha cumplido años, ahora tiene " + this.edad + " años!");
}
}
