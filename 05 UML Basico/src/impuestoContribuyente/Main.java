package impuestoContribuyente;

public class Main {
    public static void main(String[] args) {

        Contribuyente c1 = new Contribuyente("Luciano", 2033214390);
        Impuesto i1 = new Impuesto(45000, c1);
        Calculadora ca1 = new Calculadora();

        ca1.calcular(i1);


    }
}
