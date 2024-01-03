package com.hackaboss.ejercicio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <h1>Ejercicio Nº 1 - Empleados - Individual</h1>
 * <p>
 * Crea una aplicación que maneje información sobre empleados. Cada empleado
 * tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador",
 * "Analista", "Gerente"). Implementa las siguientes operaciones utilizando
 * Streams y Optionals:
 * </p>
 * <ul>
 * <li>Filtra los empleados cuyo salario sea mayor a cierto valor
 * específico.</li>
 * <li>Agrupa los empleados por categoría y calcula el salario promedio para
 * cada categoría.</li>
 * <li>Encuentra al empleado con el salario más alto utilizando Optionals.</li>
 * </ul>
 *
 * @author Borja Toledo
 */
public class Ejercicio1 {

  private static final List<Employee> employeeList = Arrays.asList(
    new Employee("Manolito", 15000, "Desarrollador"),
    new Employee("Josefina", 12000, "Analista"),
    new Employee("Fernando", 17000, "Analista"),
    new Employee("Pepe", 60000, "CEO"),
    new Employee("Jose Luis", 30000, "Desarrollador"),
    new Employee("Borja", 18500, "Desarrollador")
  );

  private static void filterHighEarners(int value) {
    System.out.println("Los empleados que ganan más de " + value + " son los siguientes: s");
    employeeList.stream()
      .filter((employee -> employee.getSalary() > value))
      .forEach(System.out::println);
  }

  private static void groupByCatAndGetAVGSalary() {
    Map<String, Double> totalEntriesByCat
      = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getCategory,
          Collectors.averagingDouble(Employee::getSalary)));

    System.out.println(totalEntriesByCat);
  }

  private static void getHighestEarner() {
//    String highestEarner = employeeList.stream()
//      .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
//      .map(Employee::getName)
//      .findFirst()
//      .orElse("No hay datos");
    Employee highestEarner = employeeList.stream()
      .max(Comparator.comparingInt(Employee::getSalary))
      .get();

    System.out.println("El que más gana es:\n" + highestEarner);
  }

  public static void main(String[] args) {
    filterHighEarners(17000);
    System.out.println("");
    employeeList.forEach(System.out::println);
    getHighestEarner();
    
    System.out.println("Las medias de salarios por categoría son: ");
    groupByCatAndGetAVGSalary();
  }
}
