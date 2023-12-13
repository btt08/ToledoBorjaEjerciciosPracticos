package ejercicio1;

/**
 *<p>
 * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres
 * de clases y variables no llevan tilde) con los siguientes atributos: cod,
 * marca, modelo, consumo y color.
 * Luego, realiza las siguientes acciones:
 *</p>
 * <ol type="a"">
 *  <li>Crea 3 objetos de la clase Electrodomestico utilizando parámetros.</li>
 *  <li>Crea 1 objeto de la clase Electrodomestico sin parámetros.</li>
 *  <li>Muestra por pantalla la marca, modelo y consumo energético de
 *      los 3 electrodomésticos creados con parámetros.</li>
 *  <li>Intenta obtener la marca del electrodoméstico creado sin parámetros.
 *       ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?</li>
 * </ol>
 */

public class Ejercicio1 {

  public static void main(String[] args) {
    Appliance wmachine = new Appliance("1", "Samsung", "wms1", 300,"white");
    Appliance dishwasher = new Appliance("2", "Siemens", "dws1", 700,"grey");
    Appliance fridge = new Appliance("3", "Bosch", "fb1", 100,"black");

    Appliance microwave = new Appliance();

    System.out.println("Primer electrodomestico");
    System.out.println("Marca: " + wmachine.getBrand());
    System.out.println("Modelo: " + wmachine.getModel());
    System.out.println("Consumo: " + wmachine.getWattage());

    System.out.println();

    System.out.println("Segundo electrodomestico");
    System.out.println("Marca: " + dishwasher.getBrand());
    System.out.println("Modelo: " + dishwasher.getModel());
    System.out.println("Consumo: " + dishwasher.getWattage());

    System.out.println();

    System.out.println("Segundo electrodomestico");
    System.out.println("Marca: " + fridge.getBrand());
    System.out.println("Modelo: " + fridge.getModel());
    System.out.println("Consumo: " + fridge.getWattage());

    System.out.println();

    System.out.println("Segundo electrodomestico");
    System.out.println("Marca: " + microwave.getBrand());
    System.out.println("Modelo: " + microwave.getModel());
    System.out.println("Consumo: " + microwave.getWattage());

    System.out.println();

    /* Los valores del objeto sin parámetros son los valores por defecto asignados por Java
      En las cadenas un null y en el numérico un 0
    * */
  }
  
}
