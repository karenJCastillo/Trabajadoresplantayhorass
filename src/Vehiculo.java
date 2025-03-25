import java.util.AbstractQueue;

public class Vehiculo {
 protected String marca;
 protected String modelo;
 protected int año;
 protected double precioPorDia;
 protected boolean disponible = true;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, double precioPorDia, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioPorDia = precioPorDia;
        this.disponible = disponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioPorDia=" + precioPorDia +
                ", disponible=" + disponible +
                '}';
    }

}
