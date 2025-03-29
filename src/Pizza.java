public class Pizza extends CosaqueCocina implements EstadoMetodos {
    private boolean masaPreparada;
    private boolean horneada;
    private boolean entregada;

    public Pizza(String tipo, boolean masaPreparada, boolean horneada, boolean entregada) {
        super(tipo); // Llamar al constructor de la clase abstracta
        this.masaPreparada = masaPreparada;
        this.horneada = horneada;
        this.entregada = entregada;
    }

    // Implementación de métodos abstractos de CosaqueCocina
    @Override
    public void prepararMasa() {
        if (!masaPreparada) {
            masaPreparada = true;
            System.out.println("La masa de la pizza " + getTipo() + " está lista.");
        } else {
            System.out.println("La masa de la pizza ya estaba preparada.");
        }
    }

    @Override
    public void hornear() {
        if (masaPreparada && !horneada) {
            horneada = true;
            System.out.println("La pizza " + getTipo() + " ha sido horneada.");
        } else {
            System.out.println("La pizza ya estaba horneada o la masa no se preparó.");
        }
    }

    @Override
    public void entregar() {
        if (horneada && !entregada) {
            entregada = true;
            System.out.println("La pizza " + getTipo() + " ha sido entregada.");
        } else {
            System.out.println("La pizza ya había sido entregada o no fue horneada.");
        }
    }

    // Implementación de métodos de la interfaz EstadoMetodos
    @Override
    public boolean isPrepararMasa() {
        return masaPreparada;
    }

    @Override
    public boolean isHorneado() {
        return horneada;
    }

    @Override
    public boolean isEntregado() {
        return entregada;
    }

    @Override
    public String toString() {
        return "Pizza tipo: " + getTipo() +
                ", Masa preparada: " + masaPreparada +
                ", Horneada: " + horneada +
                ", Entregada: " + entregada;
    }
}