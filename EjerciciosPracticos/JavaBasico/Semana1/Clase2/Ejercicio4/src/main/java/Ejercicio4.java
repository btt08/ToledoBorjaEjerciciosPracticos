import java.util.Scanner;

/**
 * <h1>
 * Ejercicio N&ordm; 4 - Matrices - Grupal
 * </h1>
 *
 * <p>
 * Imagina que estás trabajando en un sistema de reservas de asientos para un
 * teatro. Crea un programa en Java que represente un mapa de asientos en una
 * matriz de 5x5 y ten en cuenta lo siguiente:
 * <ul>
 * <li>Los asientos pueden estar ocupados (representados por "X") o vacíos
 * (representados por "O").</li>
 * <li>Permite al usuario ingresar por teclado donde quiere sentarse, indicando
 * su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa
 * debe marcar como ocupado ese asiento solo en caso de que esté vacío.</li>
 * <li>Si el asiento elegido por el usuario está ocupado, el sistema debe
 * informar que elija otro diferente.</li>
 * <li>A medida que los asientos se ocupen, el programa debe actualizar el mapa
 * de asientos y mostrarlo por pantalla luego de cada reserva.</li>
 * <li>Intenta hacer pruebas con otros compañeros, imagina que ellos son los
 * compradores y tú el encargado del teatro. ¿Funciona para todos los casos?
 * ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya
 * reservados?</li>
 * <li>El sistema deberá seguir corriendo hasta que el encargado de cargar las
 * reservas de los asientos determine que ha finalizado.</li>
 * </ul>
 * <pre>Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido
 * la última compra.</pre>
 * </p>
 */
public class Ejercicio4 {

  private static final int LENGTH = 5;
  private final char[][] seats;

  public Ejercicio4() {
    this.seats = new char[LENGTH][LENGTH];
    initializeMap();
  }

  public void setSeat(int row, int col) {
    this.seats[row][col] = 'X';
  }

  public int getLength() {
    return LENGTH;
  }

  public boolean isSeatEmpty(int row, int col) {
    return this.seats[row][col] == 'O';
  }

  private void initializeMap() {
    for (int i = 0; i < LENGTH; i++) {
      for (int j = 0; j < LENGTH; j++) {
        this.seats[i][j] = 'O';
      }
    }
  }

  private boolean isFull() {
    boolean flag = true;
    outloop:
    for (int i = 0; i < LENGTH; i++) {
      for (int j = 0; j < LENGTH; j++) {
        if (this.seats[i][j] == 'O') {
          flag = false;
          break outloop;
        }
      }
    }

    return flag;
  }

  private void status() {
    int filledSeats = 0;
    int emptySeats = 0;
    for (int i = 0; i < LENGTH; i++) {
      for (int j = 0; j < LENGTH; j++) {
        if (this.seats[i][j] == 'O') {
          emptySeats++;
        } else {
          filledSeats++;
        }
      }
    }
    System.out.println("Asientos ocupados: " + filledSeats);
    System.out.println("Asientos vacios: " + emptySeats);
  }

  private void printSeatMap() {
    System.out.print("\t ");
    for (int i = 0; i < LENGTH; i++) {
      System.out.print("  " + i);
    }
    System.out.println();
    for (int i = 0; i < LENGTH; i++) {
      for (int j = 0; j < LENGTH; j++) {
        if (j == 0) {
          System.out.print("\t" + i);
          System.out.print("  " + this.seats[i][j]);
        } else {
          System.out.print("  " + this.seats[i][j]);
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner((System.in));
    String exit = "N";
    int row = 0;
    int col = 0;
    Ejercicio4 theater = new Ejercicio4();
    
    System.out.println("Bienvenid@ al sistema de reservas");
    System.out.println("---------------------------------");
    System.out.println("Recuerde que los valores van del 0 al " + (LENGTH - 1) + ", ambos incluidos\n");

    theater.printSeatMap();

    do {
      if (theater.isFull()) {
        System.out.println("El teatro está lleno");
        break;
      }
      System.out.println("Por favor, introduzca la fila del asiento a reservar: ");
      row = sc.nextInt();
      while (row < 0 || row >= theater.getLength()) {
        System.out.println("El valor debe ser entre 0 y 4, ambos incluidos: ");
        row = sc.nextInt();
      }

      System.out.println("Ahora, introduzca la columna: ");
      col = sc.nextInt();

      while (col < 0 || col >= theater.getLength()) {
        System.out.println("El valor debe ser entre 0 y 4, ambos incluidos: ");
        col = sc.nextInt();
      }

      while (!theater.isSeatEmpty(row, col)) {
        System.out.printf("El asiento [%d, %d] está ocupado.\n\n", row, col);
        System.out.println("Por favor, introduzca la fila del asiento a reservar: ");
        row = sc.nextInt();
        System.out.println("Ahora, introduzca la columna: ");
        col = sc.nextInt();
      }

      theater.setSeat(row, col);
      System.out.printf("El asiento [%d, %d] ha sido reservado.\n\n", row, col);
      theater.printSeatMap();

      System.out.println("¿Desea finalizar? (S/N)");
      exit = sc.next().toUpperCase();
    } while (!(exit.equals("S") || exit.equals("SI")));

    System.out.println("\n\nGracias por utilizar nuestro servicio");
    System.out.println("A continuciación se muestra el estado final de las reservas");
    theater.printSeatMap();
    System.out.println();
    theater.status();
  }
}
