package com.hackaboss.ejercicio1;


/**
 *
 * @author Borja Toledo
 */
public class Employee {

  private String name;
  private int salary;
  private String category;

  public Employee() {
  }

  public Employee(String name, int salary, String category) {
    this.name = name;
    this.salary = salary;
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return "Employee{" + "name=" + name + ", salary=" + salary + ", category=" + category + '}';
  }

}
