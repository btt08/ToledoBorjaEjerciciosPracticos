/**
 * <h1>Ejercicio Nº 2 - JPA - Individual</h1>
 * <p>
 * Un restaurante necesita un programa para almacenar en una base de datos sus
 * diferentes platillos del menú. De cada uno de estos se almacena: id, nombre,
 * receta, precio.
 * </p>
 * <p>
 * Sabiendo esto:
 * </p>
 * <ul>
 * <li>Crear una base de datos llamada restaurante. Dejarla completamente
 * vacía.</li>
 * <li>Realizar las configuraciones necesarias para implementar JPA en el
 * proyecto. Esto incluye:</li>
 * <ul>
 * <li>Mapeo mediante annotations</li>
 * <li>Creación de la unidad de persistencia</li>
 * <li>Creación de los paquetes para representar capas (logica y
 * persistencia)</li>
 * <li>Creación de las clases controladoras: para la lógica y para la
 * persistencia.</li>
 * <li>Creación de los respectivos JPA Controller.</li>
 * <li>Crear un nuevo objeto platillo y darlo de alta en la base de datos
 * mediante JPA.</li>
 * <li>Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los
 * datos de otro mediante JPA.</li>
 * <li>Obtener de la base de datos los platillos restantes en la base de datos y
 * mostrarlos por pantalla.</li>
 * </ul>
 * </ul>
 */
package com.hackaboss.ejercicio2;

import com.hackaboss.ejercicio2.models.Dish;
import com.hackaboss.ejercicio2.persistence.PersistenceController;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

  // Declaración de un Scanner y un controller de manera static
  // Así pueden usarse en el programa sin pasarlo a todos los métodos
  private static Scanner sc = new Scanner(System.in);
  private static PersistenceController pc = new PersistenceController();

  /**
   * Genera un objeto Dish pidiendo por consola los valores
   *
   * @return Dish dish
   */
  public static Dish newDish() {
    System.out.println("Inserte nombre del plato: ");
    String name = sc.nextLine();

    System.out.println("Inserte receta del plato: ");
    String recipe = sc.nextLine();

    System.out.println("Inserte precio del plato: ");
    double price = sc.nextDouble();

    return new Dish(name, recipe, price);
  }

  /**
   * Llama a newDish() para generar un objeto Dish y lo inserta en la base de
   * datos
   */
  public static void insertDish() {
    pc.createDish(newDish());
    System.out.println("\nPlato insertado con éxito\n");
  }

  /**
   * Elimina un Dish de la base de datos usando un ID Llama a showDishes() para
   * mostrar las opciones al usuario y compueba si mete un id válido
   */
  public static void deleteDish() {
    showDishes();
    while (true) {
      System.out.println("\nIntroduce el ID del plato a eliminar");
      Long id = sc.nextLong();

      // Actúa según el id es válido o no
      // Si no lo es, vuelve a pedirlo al usuario
      if (checkId(id)) {
        pc.deleteDish(id);
        System.out.println("\nPlato con el ID " + id + " eliminado\n");
        break;
      } else {
        System.out.println("El id no existe");
      }
    }
  }

  /**
   * Comprueba si existe un Dish en la base de datos con ese Id
   *
   * @param id
   * @return boolean found
   */
  public static boolean checkId(Long id) {
    List<Dish> dishes = pc.getAllDishes();
    boolean found = false;

    for (Dish dish : dishes) {
      if (dish.getId() == id) {
        found = true;
        break;
      }
    }

    return found;
  }

  /**
   * Muestra todos los datos de la tabla Dish
   */
  public static void showDishes() {
    List<Dish> results = pc.getAllDishes();
    if (results.size() == 0) {
      System.out.println("\nLa base de datos está vacía\n");
    } else {
      for (Dish dish : results) {
        System.out.println(dish.toString());
      }
    }
  }

  /**
   * Muestra un menú con opciones
   */
  public static void showOptionMenu() {
    System.out.println("----------------------------------------");
    System.out.println("Bienvenid@ al sistema gestor del restaurante");
    System.out.println("----------------------------------------");
    System.out.println("1. Insertar un nuevo plato");
    System.out.println("2. Eliminar un plato por id");
    System.out.println("3. Mostrar todos los platos");
    System.out.println("4. Salir");
    System.out.println("");
  }

  public static void main(String[] args) {
    int opt = 0; // Opción elegida en el menú
    do {
      showOptionMenu();
      try {
        opt = sc.nextInt();
        sc.skip("\n"); // Para evitar problema de \n en el buffer
        switch (opt) {
          case 1:
            insertDish(); // 1. Insertar
            break;
          case 2:
            deleteDish(); // 2. Eliminar
            break;
          case 3:
            showDishes(); // 3. Mostrar
            break;
          default:
            System.out.println("Opción errónea\n");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } while (opt != 4); // 4. Salir
    System.out.println("\nSaliendo. Gracias por usar nuestro software");
    sc.close();
  }
}
