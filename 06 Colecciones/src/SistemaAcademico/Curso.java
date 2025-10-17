package SistemaAcademico;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        setProfesor(profesor); // mantiene la bidireccionalidad
    }

    public void setProfesor(Profesor profesor){
        if (this.profesor == profesor) return; // si es el mismo profesor no hace nada
        if(this.profesor != null){
            this.profesor.eliminarCurso(this); // si tiene profesor, se quita
        }
        this.profesor = profesor;

        if (profesor != null && !profesor.getCursos().contains(this)) { // bidireccionalidad
            profesor.agregarCurso(this); // si el nuevo profesor no tiene todavía este curso en su lista, lo agrego
        }
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        System.out.println("Curso: " + codigo + " - " + nombre + " | Profesor: " + nombreProfesor);
    }

}
