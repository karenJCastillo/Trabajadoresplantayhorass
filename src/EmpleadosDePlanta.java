public class EmpleadosDePlanta extends Trabajador{
    private double salarioFijo;

    public EmpleadosDePlanta(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return "Empleados De Planta{" +
                "salarioFijo=" + salarioFijo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public boolean mostrarInformacion (){
        super.mostrarInformacion();
        System.out.println( " el salario es de "+ " "+ salarioFijo);
        // System.out.println("nombre"+nombre+"edad"+edad); //+"salario Fijo"+salarioFijo
        return false;
    }
}
