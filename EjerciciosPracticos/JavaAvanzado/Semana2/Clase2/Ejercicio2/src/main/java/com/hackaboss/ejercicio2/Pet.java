package com.hackaboss.ejercicio2;

/**
 *
 * @author Borja Toledo
 * @param <T>
 */
public class Pet<T> {

  private int id;
  private String name;
  private int age;
  private String species;

  public Pet() {
  }

  public Pet(int id, String name, int age, String species) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.species = species;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  @Override
  public String toString() {
    return "Pet{" + "id=" + id + ", name=" + name + ", age=" + age + ", species=" + species + '}';
  }

}
