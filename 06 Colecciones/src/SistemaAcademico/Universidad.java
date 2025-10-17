package SistemaAcademico;
import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){
        if(p != null) profesores.add(p);
    }

    public void agregarCurso (Curso c){
        if(c != null) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id){
        Profesor encontrado = null;
        int i = 0;
        while (i <profesores.size() && encontrado == null) {
            Profesor p = profesores.get(i);
            if(p.getId().equals(id)) encontrado = p;
            i++;
        }
        return encontrado;
    }

    public Curso buscarCursoPorCodigo(String codigo){
        Curso encontrado = null;
        int i = 0;
        while (i < cursos.size() && encontrado == null){
            Curso c = cursos.get(i);
            if(c.getCodigo().equals(codigo)) encontrado = c;
            i++;
        }
        return encontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public void eliminarCurso (String codigo){
        Curso curso = buscarCursoPorCodigo(codigo);
        if(curso != null) {
            if(curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            }
        }

    public void eliminarProfesor(String id){
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null){
            while (!profesor.getCursos().isEmpty()){
                Curso c = profesor.getCursos().getFirst(); // get(0)
                c.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void reporteCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }

}
