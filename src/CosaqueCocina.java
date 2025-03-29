public abstract class CosaqueCocina {
    protected  String tipo;

    public CosaqueCocina() {
    }

    public CosaqueCocina(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CosaqueCocina{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
    public abstract void prepararMasa();
    public abstract void hornear ();
    public abstract void entregar();
}
