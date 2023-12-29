package com.hackaboss.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Ejercicio Nº 3 - Vectores y excepciones - Individual</h1>
 * <p>
 * Estás desarrollando una aplicación de gestión de datos en la que puedes
 * almacenar información en un vector y acceder a ella posteriormente. Tu tarea
 * es implementar una función que te permita almacenar datos en un vector y
 * manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
 * </p>
 * <ol>
 * <li>Desarrolla una función que te permita almacenar datos en un vector.
 * Puedes utilizar un vector de tamaño fijo para simplificar el ejercicio.</li>
 * <li>Luego, implementa un mecanismo que te permita acceder a los datos
 * almacenados en el vector proporcionando un índice.</li>
 * <li>Utiliza una excepción estándar de Java que, al intentar acceder a una
 * posición que no existe en el vector, por ejemplo, un índice que esté fuera
 * del rango del vector se pueda capturar.</li>
 * <li>Captura la excepción y proporciona un mensaje de error descriptivo que
 * indique que estás intentando acceder a una posición inválida en el
 * vector.</li>
 * </ol>
 *
 * @author Borja Toledo
 */
public class Ejercicio3 {

  private static final int[] listOfNums = new int[5];

  private static int getValueAt(int index){
    if (index >= listOfNums.length || index < 0) {
      throw new IndexOutOfBoundsException("El índice solicitado está fuera de rango\n");
    }
    return listOfNums[index];
  }

  public static void main(String[] args) {
    listOfNums[0] = 12;
    listOfNums[1] = 2;
    listOfNums[2] = 1;
    listOfNums[3] = 4;
    listOfNums[4] = 27;

    System.out.print("Introduce el índice a buscar: ");
    int index = 0;
    try {
      index = new Scanner(System.in).nextInt();
      System.out.println(getValueAt(index));
    } catch (InputMismatchException e) {
      System.out.println("Solo se aceptan valores numéricos");
    }

  }
}
