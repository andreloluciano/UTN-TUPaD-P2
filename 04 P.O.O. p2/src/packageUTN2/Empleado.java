package packageUTN2;

public class Empleado {

    static int totalEmpleados = 0;

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;         // cada vez que crea un empleado, aumenta el contador
        this.id = totalEmpleados; // le da ID segun el nro de empleado creado
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        this(nombre, puesto, 50000);}

    public static String mostrarTotalEmpleados(){
        return "Total empleados creados: " + totalEmpleados;}

    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje /100);}

    public void actualizarSalario(int cantidadFija){
        this.salario += cantidadFija;}

    public Empleado(){}

    public static int getTotalEmpleados() {
        return totalEmpleados;}

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;}

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getPuesto() {
        return puesto;}

    public void setPuesto(String puesto) {
        this.puesto = puesto;}

    public double getSalario() {
        return salario;}

    public void setSalario(double salario) {
        this.salario = salario;}

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }





}
