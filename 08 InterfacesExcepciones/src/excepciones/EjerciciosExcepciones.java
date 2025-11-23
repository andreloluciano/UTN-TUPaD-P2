package excepciones;
import java.io.*;

public class EjerciciosExcepciones {

    public static void divisionSegura() {
        try {
            int a = 10, b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        }
    }

    public static void conversionCadena() {
        try {
            String texto = "abc"; // prueba con "123"
            int numero = Integer.parseInt(texto);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: texto inválido.");
        }
    }

    public static void lecturaArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea = br.readLine();
            System.out.println("Contenido: " + linea);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static void lecturaConTryWithResources() {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo.");
        }
    }
}
