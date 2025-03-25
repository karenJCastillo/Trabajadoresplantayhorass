public class Cliente {
    //nombre, cédula y número de licencia de conducir.
    private String nombre;
    private  String cc;
    private String  licencia;

    public Cliente() {
    }

    public Cliente(String nombre, String cc, String licencia) {
        this.nombre = nombre;
        this.cc = cc;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cc=" + cc +
                ", licencia=" + licencia +
                '}';
    }


}
