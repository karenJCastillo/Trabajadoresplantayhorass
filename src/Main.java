import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Trabajador> listado = new ArrayList<>(); // lista de trabajadores de tipo Trabajador
        boolean op = true;
        int rta;
        do {
            System.out.println("""
                    Digite la opción que requiera:
                    1. Crear un Empleado de planta.
                    2. Crear un Empleado por Horas.
                    3. Mostrar el salario de cada empleado. 
                    4. Mostrar la lista de empleados.
                    """);
            rta = teclado.nextInt();
            switch (rta) {
                case 1 -> {
                    System.out.println("digite el nombre del empleado");
                    String nombre = teclado.next();
                    System.out.println("digite la edad del empleado");
                    int edad = teclado.nextInt();
                    double salarioFijo = 2100000;
                    listado.add(new EmpleadosDePlanta(nombre, edad, salarioFijo));
                }
                case 2 -> {
                    System.out.println("digite el nombre del empleado");
                    String nombre = teclado.next();
                    System.out.println("digite la edad del empleado");
                    int edad = teclado.nextInt();
                    double pagoHora = 98000;
                    System.out.println("digite las horas trabajadas por el empleado");
                    int horasTrabajadas = teclado.nextInt();
                    listado.add(new EmpleadoHoras(nombre, edad, pagoHora, horasTrabajadas));
                }
                case 3 -> { //mostrar salrio de cada empleado
                    System.out.println("digite el nombre de su empleado");
                    String nombreE = teclado.next();
                    for (int i = 0; i < listado.size(); i++) {
                        if (listado.get(i).getNombre().equalsIgnoreCase(nombreE)) {  //listado.get(i).getLibro().equalsIgnoreCase(nlibro)
                            System.out.println(listado.get(i).mostrarInformacion());
                        }
                    }
                }
                case 4 -> {
                    if (listado.isEmpty()) { // cuando la lista no tiene ningun objeto
                        System.out.println(" no tiene libros actualmente ");
                    } else {
                        for (Trabajador cu : listado) { // AQUI LLAMO LA LISTA DECLARANDO UNA VARIABLE DE TIPO LISTA USAR ESTE.
                            System.out.println(cu);
                        }
                    }
                }
            }


        } while (op);
    }
}