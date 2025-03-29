
public class Main {
    public static void main(String[] args) {
        Pizza miPizza = new Pizza("pollo con champiñones ", false, false, false);
        miPizza.prepararMasa();
        miPizza.hornear();
        miPizza.entregar();
        System.out.println(miPizza.toString());


    }
}