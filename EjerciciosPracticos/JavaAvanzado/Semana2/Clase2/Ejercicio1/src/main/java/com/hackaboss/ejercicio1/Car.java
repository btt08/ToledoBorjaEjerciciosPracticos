package com.hackaboss.ejercicio1;

/**
 *
 * @author Borja Toledo
 */
public class Car extends Vehicle {

  private int maxPassengers;
  private boolean sideDoor;

  public Car() {
    super();
  }

  public Car(int maxPassengers, boolean sideDoor, String brand, String model, int year, double price) {
    super(brand, model, year, price);
    this.maxPassengers = maxPassengers;
    this.sideDoor = sideDoor;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public boolean isSideDoor() {
    return sideDoor;
  }

  public void setSideDoor(boolean sideDoor) {
    this.sideDoor = sideDoor;
  }

  @Override
  public String toString() {

    return "Vehicle { "
      + "brand = " + this.getBrand()
      + ", model = " + this.getModel()
      + ", year = " + this.getYear()
      + ", price = " + this.getPrice()
      + "\n\t{Car { maxPassengers = " + maxPassengers
      + ", sideDoor = " + sideDoor + '}';
    }
  }
