import java.util.ArrayList;

/**
 * <h1>Ejercicio N&ordm; 1 - Collections, Clases Abstractas e Interfaces - Drupal</h1>
 *
 * <p>
 *     Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.
 * </p>
 *
 * <ul type=a>
 *     <li>Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.</li>
 *     <li>Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.</li>
 *     <li>Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.</li>
 *     <li>Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.</li>
 *     <li>Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.</li>
 *     <li>Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.</li>
 *     <li>Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.</li>
 * </ul>
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Car car1 = new Car("id1","matricula1","marca1","modelo1",1999, 15999, 7000,600);
        Van van1 = new Van("id2","matricula2","marca2","modelo2",2003, 35569, 200, 750);
        Bike bike1 = new Bike("id3","matricula3","marca3","modelo3",1969, 8453,600, "tipo1");

        vehicles.add(car1);
        vehicles.add(van1);
        vehicles.add(bike1);

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.toString());
            if (vehicle instanceof Car) ((Car)vehicle).chargeEnergy();
            if (vehicle instanceof Van) ((Van)vehicle).refuel();
            if (vehicle instanceof Bike) ((Bike)vehicle).refuel();
        }

    }
}
