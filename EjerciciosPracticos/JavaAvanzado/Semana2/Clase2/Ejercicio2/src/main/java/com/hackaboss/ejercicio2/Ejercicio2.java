package com.hackaboss.ejercicio2;

import java.util.Random;

/**
 * <h>Ejercicio 2: Veterinaria</h1>
 * <p>
 * Una clínica veterinaria necesita un sistema para administrar su registro de
 * mascotas, para ello, se solicita la definición de una clase genérica
 * Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o
 * id de mascota para identificar a cada una). Crea una clase utilitaria propia
 * llamada RegistroMascotas que cuente con métodos genéricos para:
 * </p>
 * <ol>
 * <li>Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto
 * con genéricos para manipular colecciones como ArrayList o LinkedList y
 * agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar
 * como ejemplos de tipos: perros, gatos, reptiles y aves).</li>
 * <li>Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases
 * utilitarias como Collections o Arrays junto con genéricos para realizar
 * búsquedas eficientes por nombre o especie dentro del registro de
 * mascotas.</li>
 * <li>Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de
 * java.util para obtener el tamaño de la colección y contar la cantidad total
 * de mascotas registradas en la veterinaria.</li>
 * <li>Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de
 * java.util para generar datos aleatorios, como nombres, edades o especies,
 * para agregar mascotas al registro.</li>
 * </ol>
 *
 * @author Borja Toledo
 */
public class Ejercicio2 {

  public static int getRandNum(int n) {
    return new Random().nextInt(n);
  }

  public static String getRandName() {
    String[] names = {"Chuchi", "Puchi", "Minino", "Daisy"};
    return names[getRandNum(names.length)];
  }

  public static String getRandSpecies() {
    String[] species = {"Gato", "Perro", "Ave", "Reptil"};
    return species[getRandNum(species.length)];
  }

  public static void main(String[] args) {
    PetRegistry petReg = new PetRegistry();

    petReg.addPet(new Pet(1, getRandName(), getRandNum(20), getRandSpecies()));
    petReg.addPet(new Pet(2, getRandName(), getRandNum(20), getRandSpecies()));
    petReg.addPet(new Pet(3, getRandName(), getRandNum(20), getRandSpecies()));
    
    System.out.println("Buscando especie Gato: ");
    petReg.showPets(petReg.findPetByNameOrSpecies("Gato"));
    
    System.out.println("Buscando nombre Daisy: ");
    petReg.showPets(petReg.findPetByNameOrSpecies("Daisy"));
    
    
    System.out.println("");
    
    petReg.showPets();
    System.out.println(petReg.size());
  }
}
