package excepciones;

public class Main {
    public static void main(String[] args) {
        EjerciciosExcepciones.divisionSegura();
        EjerciciosExcepciones.conversionCadena();
        EjerciciosExcepciones.lecturaArchivo();
        EjerciciosExcepciones.lecturaConTryWithResources();

        try {
            int edad = -5;
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

