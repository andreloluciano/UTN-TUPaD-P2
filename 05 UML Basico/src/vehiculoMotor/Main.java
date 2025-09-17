package vehiculoMotor;

public class Main {
    public static void main(String[] args) {

        Conductor c1 = new Conductor ("Luciano", "B15");
        Motor m1 = new Motor ("V8", 456980);
        Vehiculo v1 = new Vehiculo("MRZ 376", "Toyota 86", c1, m1);

        System.out.println(v1);
        System.out.println(m1);
        System.out.println(c1);

    }
}
