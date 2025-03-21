public class EmpleadoHoras extends Trabajador {
    private double pagoHora;
    private int horasTrabajadas;

    public EmpleadoHoras(String nombre, int edad, double pagoHora, int horasTrabajadas) {
        super(nombre, edad);
        this.pagoHora = pagoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Empleado por Horas{" +
                "pagoHora=" + pagoHora +
                ", horasTrabajadas=" + horasTrabajadas +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public boolean mostrarInformacion   (){
        super.mostrarInformacion();
        System.out.println(" el salario es de "+" "+ horasTrabajadas*pagoHora);
         //System.out.println("nombre"+nombre+"edad"+edad); //+"Horas trabajadas"+horasTrabajadas
        return false;
    }

}
