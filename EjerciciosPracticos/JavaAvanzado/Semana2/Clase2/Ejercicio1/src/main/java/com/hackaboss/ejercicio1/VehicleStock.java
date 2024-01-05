package com.hackaboss.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleStock<T extends Vehicle> {

  private final List<T> listOfVehicles;

  public VehicleStock() {
    this.listOfVehicles = new ArrayList<>();
  }

  public void addVehicle(T vehicle) {
    this.listOfVehicles.add(vehicle);
    System.out.println("Vehículo añadido correctamente.");
  }

  public List<T> findVehicleByYear(int year) {
    return listOfVehicles.stream()
      .filter(vehicle -> vehicle.getYear() == year)
      .collect(Collectors.toList());
  }

  public double getTotalValue() {
    return listOfVehicles.stream()
      .reduce(0.0,
        (subtotal, vehicle) -> subtotal + vehicle.getPrice(),
        Double::sum);
  }
  
  public void showStock() {
    for(T vehicle : listOfVehicles){
      System.out.println(vehicle.toString());
    }
  }

}
