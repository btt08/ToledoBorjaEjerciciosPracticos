package com.hackaboss.ejercicio1;

import java.util.List;

/**
 * <h1>Ejercicio 1: Concesionaria de Autos</h1>
 * <p>
 *  Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
 * </p>
 * <ol>
 *  <li>Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.</li>
 *  <li>Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.</li>
 *  <li>Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario. </li>
 * </ol>
 * @author Borja Toledo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      VehicleStock stock = new VehicleStock();
      
      stock.addVehicle(new Car(5, false, "Ford", "Mondeo", 1999, 24000));
      stock.addVehicle(new Car(2, false, "Porsche", "911", 1990, 130000));
      stock.addVehicle(new Car(8, true, "Ford", "Transit", 2001, 13000));
      stock.addVehicle(new Van(900, true, "Peugeot", "Parner", 1999, 15000));
      stock.addVehicle(new Van(1300, false, "Mercedes Benz", "Vito", 2003, 18000));
      
      int yearToSearchFor = 1999;

      stock.findVehicleByYear(yearToSearchFor).stream()
        .forEach(System.out::println);
      
      System.out.println("\nPrecio total: " + stock.getTotalValue());
      
//      stock.showStock();
    }
}
