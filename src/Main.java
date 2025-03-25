import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean estado = true; // para do while
        int opcion;
        List<Vehiculo> listacarros = new ArrayList<>(); //lista donde se almacenan los carros
        List<Vehiculo> listaCamionetas = new ArrayList<>(); // lista donde se almacenan las camionetas
        List<Cliente> listaclientes = new ArrayList<>(); // lista donde estan lso clientes


        do {
            System.out.println("""
                escoge una de las siguientes opciones.
                1. registrar automovil.
                2. registrar camioneta.
                3. registrar cliente.
                4. realizar un alquiler.
                5. lista de vehiculos disponibles.
                6. Devolucion.""");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("digite la marca del automovil ");
                    String marca = teclado.next();
                    System.out.println(" digite el modelo del auto");
                    String modelo = teclado.next();
                    System.out.println("digite el año del auto");
                    int año = teclado.nextInt();
                    System.out.println("digite el precio que va a tener por dia ");
                    double precioPorDia = teclado.nextDouble();
                    boolean disponible = true;
                    System.out.println(" digite el numero de puertas que tiene el auto");
                    int numPuertas = teclado.nextInt();
                    listacarros.add(new Autos(marca, modelo, año, precioPorDia, disponible, numPuertas));
                }
                case 2 -> {
                    System.out.println("digite la marca de la camioneta ");
                    String marca = teclado.next();
                    System.out.println(" digite el modelo de la camioneta ");
                    String modelo = teclado.next();
                    System.out.println("digite el año de la camioneta ");
                    int año = teclado.nextInt();
                    System.out.println("digite el precio que va a tener por dia ");
                    double precioPorDia = teclado.nextDouble();
                    boolean disponible = true;
                    System.out.println(" digite los kilogramos ");
                    double kilogramos = teclado.nextDouble();
                    listaCamionetas.add(new Camionetas(marca, modelo, año, precioPorDia, disponible, kilogramos));
                }
                case 3 -> {
                    System.out.println(" digite el nombre del cliente ");
                    String nombre = teclado.next();
                    System.out.println(" digite el numero de identificacion");
                    String cc = teclado.next();
                    System.out.println(" digite el numero de la licencia de conducir");
                    String licencia = teclado.next();
                    listaclientes.add(new Cliente(nombre, cc, licencia));
                }
                case 4 -> {
                    System.out.println("""
                            ¿Qué vehiculo desea alquilar?
                            1. automovil.
                            2. camioneta.
                             """);
                    int opA = teclado.nextInt();
                    if (opA == 1) { // recorrer lista de autos
                        for (int i = 0; i < listacarros.size(); i++) {

                            if (!listacarros.get(i).isDisponible()) { // si el disponible es falso
                                System.out.println(" el automovil no esta disponible selecciona otro ");
                            } else {
                                System.out.println("ingrese su numero de identificacion  ");
                                String Pruname = teclado.next();

                                boolean find = false;

                                    for (int e = 0; e < listaclientes.size(); e++) {
                                        if (listaclientes.get(i).getCc().equalsIgnoreCase(Pruname)) { ///
                                            find = true;
                                            System.out.println(" digite el numero de dias que quiere arrendar el vehiculo");
                                            int diasquierearrendar = teclado.nextInt();
                                            listacarros.get(i).setDisponible(false); // cambio de estado a no disponible
                                            System.out.println(" acontinuacion se calculara el valor total de su alquiler");
                                            double total = diasquierearrendar * listacarros.get(i).getPrecioPorDia();
                                            if (diasquierearrendar <= 7) {
                                                System.out.println("su total es de : " + " $" + total);
                                            } else if (diasquierearrendar > 7) {
                                                total = total * 0.1;
                                                System.out.println("se le ha aplicado un descuento del 10% su total es de :" + "  $" + total);
                                            }
                                        } else if  (!find) {
                                                System.out.println(" el cliente no esta registrado en nuestra lista");
                                            }
                                    }

                            }
                        }
                    } else if (opA == 2) {
                        for (int i = 0; i < listaCamionetas.size(); i++) {
                            if (!listaCamionetas.get(i).isDisponible()) {
                                System.out.println(" el automovil no esta disponible selecciona otro ");
                            } else {
                                boolean find = false;
                                System.out.println("ingrese su  numero de identificacion ");
                                String Pruname = teclado.next();

                                    if (listaclientes.get(i).getCc().equalsIgnoreCase(Pruname)) {
                                        find = true;
                                        System.out.println(" digite el numero de dias que quiere arrendar el vehiculo");
                                        int diasquierearrendar = teclado.nextInt();
                                        listaCamionetas.get(i).setDisponible(false);
                                        System.out.println(" acontinuacion se calculara el valor total de su alquiler");
                                        double total = diasquierearrendar * listaCamionetas.get(i).getPrecioPorDia();
                                        if (diasquierearrendar <= 7) {
                                            System.out.println("su total es de : " + " $" + total);
                                        } else if (diasquierearrendar > 7) {
                                            total = total * 0.1;
                                            System.out.println("se le ha aplicado un descuento del 10% su total es de :" + "  $" + total);
                                        }
                                    } else if (!find) {
                                        System.out.println(" el cliente no esta registrado en nuestra lista");
                                    }


                            }

                        }

                    }
                }
                case 5 -> {
                    for(Vehiculo recorridocarro : listacarros) { // se agrega recorridocarro como la variable que represneta los objetos
                        if (recorridocarro.isDisponible()){ // si el objeto es true
                            System.out.println("los automoviles disponiobles son "+ recorridocarro);
                        }
                    }
                    for (Vehiculo recorridocamioneta : listaCamionetas){
                        if ( recorridocamioneta.isDisponible()){
                            System.out.println("las camionetas disponibles son"+recorridocamioneta);
                        }
                    }

                }
                case 6 -> {
                    System.out.println("ingrese el numero de indentificacion ");
                    String numcc= teclado.next();
                    boolean find = false;

                    for (Cliente recorridocliente : listaclientes) {
                        if (recorridocliente.getCc().equalsIgnoreCase(numcc)) {
                            for (Vehiculo recorridocarro : listacarros){
                                if (!recorridocarro.isDisponible()){
                                    System.out.println("el automovil "+recorridocarro.getMarca()+"el estado esta disponible ");
                                recorridocarro.setDisponible(true);
                                }
                            }
                            for (Vehiculo recorridoCamioneta : listaCamionetas){
                                if (!recorridoCamioneta.isDisponible()){
                                    System.out.println("el automovil "+recorridoCamioneta.getMarca()+"el estado esta disponible ");
                                    recorridoCamioneta.setDisponible(true);

                                }
                            }
                        }
                    }

                }

            }

        } while (estado);
    }
}