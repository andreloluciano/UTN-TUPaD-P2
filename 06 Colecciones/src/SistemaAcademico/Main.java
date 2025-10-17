package SistemaAcademico;

public class Main {
    public static void main(String[] args){

                Universidad u = new Universidad("UBA");

                Profesor p1 = new Profesor("P01", "Ana Torres", "Matemática");
                Profesor p2 = new Profesor("P02", "Luis Gómez", "Informática");
                Profesor p3 = new Profesor("P03", "Clara Ruiz", "Física");

                Curso c1 = new Curso("C101", "Álgebra", p1);
                Curso c2 = new Curso("C102", "Programación", p2);
                Curso c3 = new Curso("C103", "Física I", p3);
                Curso c4 = new Curso("C104", "Estadística", p1);
                Curso c5 = new Curso("C105", "Bases de Datos", p2);

                u.agregarProfesor(p1);
                u.agregarProfesor(p2);
                u.agregarProfesor(p3);

                u.agregarCurso(c1);
                u.agregarCurso(c2);
                u.agregarCurso(c3);
                u.agregarCurso(c4);
                u.agregarCurso(c5);

                // Asignaciones
                u.asignarProfesorACurso("C101", "P01");
                u.asignarProfesorACurso("C102", "P02");
                u.asignarProfesorACurso("C103", "P03");
                u.asignarProfesorACurso("C104", "P01");
                u.asignarProfesorACurso("C105", "P02");

                // Listados
                u.listarCursos();
                u.listarProfesores();

                // Reasignación
                System.out.println(" Cambio de profesor:");
                u.asignarProfesorACurso("C104", "P03");

                // Eliminar curso
                System.out.println(" Eliminando curso C102:");
                u.eliminarCurso("C102");

                // Eliminar profesor
                System.out.println(" Eliminando profesor P01:");
                u.eliminarProfesor("P01");

                // Reporte
                System.out.println(" Reporte:");
                u.reporteCursosPorProfesor();
            }
        }






