package pacienteProfesional;

public class Main {
    public static void main(String[] args) {

        Paciente p1 = new Paciente ("Luciano", "OSECAC");
        Profesional d1 = new Profesional ("Axel O'Connor", "Dermatologo");
        CitaMedica c1 = new CitaMedica("27-09-2025", "19:00", p1, d1);

        System.out.println(c1);
        System.out.println(d1.getEspecialidad());
        System.out.println(p1.getObraSocial());
}
}




