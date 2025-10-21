package Empleado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Luciano", 250000, 50000));
        empleados.add(new EmpleadoTemporal("Martina", 20, 12000));
        empleados.add(new EmpleadoPlanta("Carlos", 200000, 30000));
        empleados.add(new EmpleadoTemporal("Sofía", 15, 10000));

        for (Empleado e : empleados) {
            e.mostrarInfo();
            System.out.println("Sueldo: $" + e.calcularSueldo());

            //instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println("---------------------------------");
        }
    }
}

