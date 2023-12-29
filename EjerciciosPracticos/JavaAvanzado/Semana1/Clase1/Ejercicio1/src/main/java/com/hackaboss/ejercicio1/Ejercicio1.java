package com.hackaboss.ejercicio1;

import com.hackaboss.ejercicio1.exceptions.InvalidBookingException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Ejercicio Nº 1 - Reserva de Vuelos - Individual</h1>
 * <p>
 * Imagina que estás desarrollando un sistema de reservas de vuelos para una
 * aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando
 * información como su nombre, destino, fecha de viaje y número de asientos
 * deseados. Tu tarea es implementar una función de reserva de vuelos que valide
 * los datos ingresados y maneje excepciones si los datos son incorrectos o si
 * no hay suficientes asientos disponibles en el vuelo.
 * </p>
 * <p>
 * Debes crear una excepción personalizada, por ejemplo,
 * ReservaInvalidaException, que se lance en situaciones excepcionales, como
 * cuando un usuario intenta reservar más asientos de los disponibles o si falta
 * información esencial. La excepción personalizada debe proporcionar un mensaje
 * claro sobre la causa del error.
 * </p>
 *
 * @author Borja Toledo
 */
public class Ejercicio1 {

  private static final Scanner sc = new Scanner(System.in);
  private static final int MAX_NUM_SEATS = 3;

  private static Booking bookFlight() throws InvalidBookingException {
    System.out.println("Ingrese su nombre para la reserva: ");
    String name = sc.nextLine();
    if (name == null || name.isBlank()) {
      throw new InvalidBookingException("El nombre no puede ser vacío");
    }

    System.out.println("Ingrese el destino: ");
    String goingTo = sc.nextLine();
    if (goingTo == null || goingTo.isBlank()) {
      throw new InvalidBookingException("El destino no puede ser valío");
    }

    System.out.println("Ingrese la fecha: ");
    String strFlightDate = sc.nextLine();
    LocalDate flightDate;
    try {
      flightDate = LocalDate.parse(strFlightDate);
    } catch (Exception e) {
      throw new InvalidBookingException("El formato de fecha es inválido");
    }

    System.out.println("Ingrese el numero de asientos: ");
    int numSeats = 0;

    try {
      numSeats = sc.nextInt();
      if (numSeats > MAX_NUM_SEATS) {
        throw new InvalidBookingException("");
      }
    } catch (InputMismatchException e) {
      System.out.println("Solo se aceptan números");
    }
    
    return new Booking(name, goingTo, flightDate, numSeats);
  }

  public static void main(String[] args) {
    Booking booking = bookFlight();
    
    System.out.println("Los datos de la reserva son: ");
    System.out.println(booking.toString());
  }
}
