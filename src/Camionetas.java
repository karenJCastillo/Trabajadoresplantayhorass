public class Camionetas extends Vehiculo {
        private double kilogramos;

    public Camionetas(String marca, String modelo, int año, double precioPorDia, boolean disponible, double kilogramos) {
        super(marca, modelo, año, precioPorDia, disponible);
        this.kilogramos = kilogramos;
    }

    public double getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(double kilogramos) {
        this.kilogramos = kilogramos;
    }

    @Override
    public String toString() {
        return "Camionetas{" +
                "kilogramos=" + kilogramos +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioPorDia=" + precioPorDia +
                ", disponible=" + disponible +
                '}';
    }



}
