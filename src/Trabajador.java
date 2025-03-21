public class Trabajador {
    protected String nombre;
    protected int edad;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public boolean mostrarInformacion (){
        System.out.println("nombre :"+"  "+nombre);
        System.out.println("edad :"+"  "+edad);


        return false;
    }

}
