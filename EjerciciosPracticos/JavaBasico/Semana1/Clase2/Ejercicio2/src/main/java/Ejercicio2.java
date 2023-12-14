import java.util.Scanner;

/**
 *<h1>
 * Ejercicio N&ordm; 2 - Estructuras Repetitivas - Individual
 *</h1>
 *
 *<p>
 * a) Imagina que eres un cajero en un supermercado.
 * Crea un programa en Java que permita ingresar el precio de
 * varios productos comprados por un cliente.
 *</p>
 *<p>
 * Utiliza una estructura repetitiva (la que quieras) para
 * continuar pidiendo precios hasta que el usuario decida
 * finalizar. Luego, muestra el total de la compra que debe
 * abonar.
 *</p>
 * <pre>
 * Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador
 * (cuando sabemos un número exacto de productos por ejemplo) u por centinela
 * (cuando no sabemos cuántos productos va a comprar el cliente).
 * En este caso debes aplicar un “centinela”. Un ejemplo podría ser,
 * si se ingresa un número negativo o un 0 como monto de un producto.
 * </pre>
 */
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double price;

        do{
            System.out.println("Inserte un precio (0 para finalizar): ");
            price = sc.nextDouble();

            total += price;

        }while(price != 0);

        System.out.println("El total a pagar es: " + total);
    }
}
