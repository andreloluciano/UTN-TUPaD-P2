package SistemaAcademico;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if(curso == null) return;
        if (!cursos.contains(curso)){
            cursos.add(curso);
            if(curso.getProfesor() != this){
                curso.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso curso){
        if(curso == null) return;
        if(cursos.remove(curso)){
            if(curso.getProfesor() == this){
                curso.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id + " | Especialidad: " + especialidad);
        System.out.println("Cursos dictados: " + cursos.size());
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public ArrayList<Curso> getCursos() { return cursos; }

}
