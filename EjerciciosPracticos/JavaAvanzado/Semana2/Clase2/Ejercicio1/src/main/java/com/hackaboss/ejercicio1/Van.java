package com.hackaboss.ejercicio1;

/**
 *
 * @author Borja Toledo
 */
public class Van extends Vehicle {

  private int maxWeightCapacity;
  private boolean doubleDoor;

  public Van() {
    super();
  }

  public Van(int maxWeightCapacity, boolean doubleDoor, String brand, String model, int year, double price) {
    super(brand, model, year, price);
    this.maxWeightCapacity = maxWeightCapacity;
    this.doubleDoor = doubleDoor;
  }

  public int getMaxWeightCapacity() {
    return maxWeightCapacity;
  }

  public void setMaxWeightCapacity(int maxWeightCapacity) {
    this.maxWeightCapacity = maxWeightCapacity;
  }

  public boolean isDoubleDoor() {
    return doubleDoor;
  }

  public void setDoubleDoor(boolean doubleDoor) {
    this.doubleDoor = doubleDoor;
  }

  @Override
  public String toString() {
    return "Vehicle { "
      + "brand = " + this.getBrand()
      + ", model = " + this.getModel()
      + ", year = " + this.getYear()
      + ", price = " + this.getPrice()
      + "\n\t{Van { maxWeightCapacity = " + maxWeightCapacity
      + ", doubleDoor = " + doubleDoor + '}';
  }

  
  
}
