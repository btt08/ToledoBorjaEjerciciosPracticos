package com.hackaboss.ejercicio2.exceptions;

/**
 *
 * @author Borja Toledo
 */
public class InvalidProductDataException extends RuntimeException{

  /**
   * Creates a new instance of <code>InvalidProductDataException</code> without
   * detail message.
   */
  public InvalidProductDataException() {
  }

  /**
   * Constructs an instance of <code>InvalidProductDataException</code> with the
   * specified detail message.
   *
   * @param msg the detail message.
   */
  public InvalidProductDataException(String msg) {
    super(msg);
  }
}
