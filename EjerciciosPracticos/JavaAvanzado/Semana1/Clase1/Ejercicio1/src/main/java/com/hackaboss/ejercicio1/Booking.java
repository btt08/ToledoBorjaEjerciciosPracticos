package com.hackaboss.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author Anonymus
 */
public class Booking {
  private String name;
  private String goingTo;
  private LocalDate flightDate;
  private int numSeats;

  public Booking(String name, String goingTo, LocalDate flightDate, int numSeats) {
    this.name = name;
    this.goingTo = goingTo;
    this.flightDate = flightDate;
    this.numSeats = numSeats;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGoingTo() {
    return goingTo;
  }

  public void setGoingTo(String goingTo) {
    this.goingTo = goingTo;
  }

  public LocalDate getFlightDate() {
    return flightDate;
  }

  public void setFlightDate(LocalDate flightDate) {
    this.flightDate = flightDate;
  }

  public int getNumSeats() {
    return numSeats;
  }

  public void setNumSeats(int numSeats) {
    this.numSeats = numSeats;
  }

  @Override
  public String toString() {
    return "Booking{" + "name=" + name + ", goingTo=" + goingTo + ", flightDate=" + flightDate + ", numSeats=" + numSeats + '}';
  }
  
  
}
