package packageUTN;

public class Estudiante {
    // atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // constrictor
public Estudiante(String nombre, String apellido, String curso, double calificacion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.calificacion = calificacion;
}
    //constructor en caso de no dar parametros
public Estudiante(){

}
    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    //_________________________________________________________//
    // metodos

public void mostrarInfo(){
    System.out.println("Estudiante: " + nombre + " " + apellido);
    System.out.println("Curso: " + curso);
    System.out.println("Calificacion: " + calificacion);
}

public void subirCalificacion(double puntos){
    this.calificacion += puntos;
}

public void bajarCalificacion(double puntos){
    this.calificacion -= puntos;
}

}
