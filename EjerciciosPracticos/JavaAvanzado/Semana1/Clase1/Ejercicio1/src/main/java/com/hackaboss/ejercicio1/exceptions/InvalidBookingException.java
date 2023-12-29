package com.hackaboss.ejercicio1.exceptions;

/**
 *
 * @author Borja Toledo
 */
public class InvalidBookingException extends RuntimeException{

  public InvalidBookingException() {
    super();
  }

  public InvalidBookingException(String message) {
    super(message);
  }
   
  
}
