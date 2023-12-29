package com.hackaboss.ejercicio2;

import com.hackaboss.ejercicio2.exceptions.InvalidProductDataException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual</h1>
 * <p>
 * Imagina que estás desarrollando un sistema de gestión de inventarios para un
 * comercio minorista. Los usuarios pueden agregar productos al inventario
 * proporcionando información como el nombre del producto, el precio y la
 * cantidad disponible. Tu tarea es implementar una función que maneje la
 * gestión de inventarios, validando los datos ingresados y manejando
 * excepciones en caso de errores o datos inválidos.</p>
 * <p>
 * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso
 * de que ésta sea opersonalizada) o de utilizar los tipos correctos de
 * excepción en cada caso. </p>
 *
 * @author Borja Toledo
 */
public class Ejercicio2 {

  private static final Scanner sc = new Scanner(System.in);

  private static Product createProduct() throws InvalidProductDataException {
    System.out.println("Nombre: ");
    String name = sc.nextLine();

    if (name == null || name.isBlank()) {
      throw new InvalidProductDataException("El nombre no puede ser vacio");
    }

    System.out.println("Precio: ");
    double price = 0.0;

    try {
      price = sc.nextDouble();
      if (price <= 0) {
        throw new InvalidProductDataException("El precio no puede ser 0 o negativo");
      }
    } catch (InputMismatchException e) {
      System.out.println("Solo admite caracteres numericos");
    }

    System.out.println("Stock: ");
    int stock = 0;

    try {
      stock = sc.nextInt();
      if (stock <= 0) {
        throw new InvalidProductDataException("El precio no puede ser 0 o negativo");
      }
    } catch (InputMismatchException e) {
      System.out.println("Solo admite caracteres numericos");
    }

    return new Product(name, price, stock);
  }

  public static void main(String[] args) {
    Product product = createProduct();
    
    System.out.println("Datos del producto creado: ");
    
    System.out.println(product.toString());
    
  }
}
