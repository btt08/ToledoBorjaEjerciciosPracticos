package com.hackaboss.ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>Ejercicio Nº 2 - Gestor de Eventos - Individual</h1>
 * <p>
 * Imagina que estás construyendo una aplicación para gestionar eventos en una
 * agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo,
 * "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
 * utilizando Streams y Optionals:</p>
 * <ul>
 * <li>Filtra los eventos que están programados para una fecha específica.</li>
 * <li>Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada
 * categoría.</li>
 * <li>Encuentra el evento más próximo en el tiempo utilizando Optionals. </li>
 * </ul>
 *
 * @author Borja Toledo
 */
public class Ejercicio2 {

  private static final List<Event> eventList = Arrays.asList(
    new Event("Reunión hackaboss", LocalDate.now(), "Reunion"),
    new Event("Conferencia ciberseguridad", LocalDate.parse("2025-05-05"), "Conferencia"),
    new Event("Taller POO", LocalDate.parse("2021-01-01"), "Taller"),
    new Event("Reunión Softtek", LocalDate.parse("2024-04-04"), "Reunion")
  );

  private static void filterByDate(LocalDate date) {
    eventList.stream()
      .filter((event) -> event.getDate().equals(date))
      .forEach(System.out::println);
  }

  private static void getNearestEvent() {
    System.out.println(
      eventList.stream()
        .filter(event -> event.getDate().isAfter(LocalDate.now()))
        .min(
          Comparator.comparingLong(
            event -> ChronoUnit.DAYS.between(LocalDate.now(), event.getDate()))
        )
      .get()
    );
  }

  private static void countByCategory() {
    System.out.println(
      eventList.stream()
        .collect(Collectors.groupingBy(Event::getCategory,
          Collectors.counting()))
    );
  }

  public static void main(String[] args) {
    filterByDate(LocalDate.parse("2025-05-05"));
    System.out.println();
    countByCategory();
    System.out.println();
    getNearestEvent();
    
//    System.out.println("\n\n\n");
//    eventList.forEach(event -> {
//      System.out.println(event.getDate());
//      System.out.println(ChronoUnit.DAYS.between(event.getDate(), LocalDate.now()));
//    });
  }
}
