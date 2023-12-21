/**
 * <h!>Ejercicio Nº 1 - JDBC - Individual</h1>
 * <p>
 * Crear una aplicación para gestionar una lista de estudiantes en una base de
 * datos. Los estudiantes tendrán atributos como id, nombre, edad y
 * calificación.
 * </p>
 * <ul>
 * <li>El sistema debe ser capaz de permitir agregar nuevos estudiantes,
 * recuperar la lista de todos y mostrar su información.</li>
 * <li>Crear una base de datos mediante MySQL llamada universidad y una tabla
 * llamada estudiantes cuyas columnas coincidan con los atributos de la clase
 * estudiante.</li>
 * <li>Utilizar JDBC (Java Database Connectivity) para interactuar con la base
 * de datos.</li>
 * </ul>
 */
package com.hackaboss.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {

  private static Connection getConnection() {
    String url = "jdbc:mysql://localhost:3306/universidad";
    String usuario = "root";
    String contraseña = "";
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(url, usuario, contraseña);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  private static Student getStudentData(Scanner sc) {
    System.out.println("Nombre del alumno: ");
    String name = sc.nextLine();
    System.out.println("Edad del alumno: ");
    int age = sc.nextInt();
    System.out.println("Nota del alumno: ");
    double marks = sc.nextDouble();
    return new Student(name, age, marks);
  }

  private static void addStudent(Student student) {
    Connection connection = null;
    Statement statement = null;
    String sql = "INSERT INTO estudiantes (name, age, marks) VALUES ('"
            + student.getName() + "', "
            + student.getAge() + ", "
            + student.getMarks()
            + ")";
    System.out.println(sql);
    try {
      connection = getConnection();
      statement = connection.createStatement();
      statement.execute(sql);

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        statement.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  private static void showAllStudents() {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = getConnection();
      statement = connection.createStatement();
      String sql = "SELECT * FROM estudiantes";
      ResultSet results = statement.executeQuery(sql);
      System.out.println("\tID\t\tNombre\t\tEdad\t\tNotas");
      while (results.next()) {
        int id = results.getInt("id");
        String name = String.format("%15s", results.getString("name"));
        int age = results.getInt("age");
        double marks = results.getDouble("marks");

        System.out.println("\t" + id + "\t " + name + "\t" + age + "\t\t" + marks);
      }
      results.close();

    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      try {
        statement.close();
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opt = 0;

    do {
      System.out.println("\nBienvenido al panel de ingreso de estudiantes");
      System.out.println("---------------------------------------------");
      System.out.println("1. Insertar alumno");
      System.out.println("2. Mostrar todos los alumnos");
      System.out.println("3. Salir");
      System.out.println("Introduzca una opción: ");
      opt = sc.nextInt();
      sc.skip("\n");

      try {
        if (opt == 1) {

          addStudent(getStudentData(sc));
          System.out.println("\nAlumno dado de alta satisfactoriamente");
        }
        if (opt == 2) {
          showAllStudents();
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    } while (opt != 3);
  }
}
