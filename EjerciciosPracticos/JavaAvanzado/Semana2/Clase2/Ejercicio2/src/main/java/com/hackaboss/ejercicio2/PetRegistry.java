package com.hackaboss.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Borja Toledo
 * @param <T>
 */
public class PetRegistry<T extends Pet> {

  private final List<T> pets;

  public PetRegistry() {
    pets = new ArrayList<>();
  }

  public void addPet(T pet) {
    pets.add(pet);
    System.out.println("Mascota añadida correctamente");
  }

  public List<T> findPetByNameOrSpecies(String value) {
    return pets.stream()
      .filter(pet -> pet.getName().equals(value)
      || pet.getSpecies().equals(value))
      .collect(Collectors.toList());
  }

  public void showPets() {
    for (T pet : pets) {
      System.out.println(pet);
    }
  }
  
  public void showPets(List<T> pets) {
    if (pets.isEmpty()) System.out.println("No hay resultados");
    for (T pet : pets) {
      System.out.println(pet);
    }
  }

  public int size() {
    return pets.size();
  }
}
