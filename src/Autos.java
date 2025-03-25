public class Autos extends Vehiculo {
    private int numPuertas;

    public Autos(String marca, String modelo, int año, double precioPorDia, boolean disponible, int numPuertas) {
        super(marca, modelo, año, precioPorDia, disponible);
        this.numPuertas = numPuertas;
    }


    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Autos{" +
                "numPuertas=" + numPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioPorDia=" + precioPorDia +
                ", disponible=" + disponible +
                '}';
    }




}
