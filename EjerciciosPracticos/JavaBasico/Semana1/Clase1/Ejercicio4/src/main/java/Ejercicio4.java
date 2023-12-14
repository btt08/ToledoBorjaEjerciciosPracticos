import java.util.Scanner;

/**
 *<h1>
 * Ejercicio N&ordm; 4 - Operaciones de Lectura - Grupal
 *</h1>
 *
 *<p>
 * Crea un programa que pida al usuario que ingrese por teclado
 * dos números enteros y realice las siguientes operaciones
 * con ellos: suma, resta, multiplicación y división.
 * Muestra por pantalla/consola los resultados de cada una
 * de las operaciones con un mensaje amigable para el usuario.
 *
 * <pre>Sugerencia: Compara los resultados que obtengas con otros
 * compañeros. Pide a tus compañeros que te digan números al azar
 * y haz las pruebas necesarias para comprobar el funcionamiento
 * de tu programa.</pre>
 * <p>Extra: ¿Qué sucede si como segundo número de una división
 * se ingresa 0? Con lo que sabes o aprendiste hasta ahora…
 * ¿De qué manera tratarías de evitar ésta situación?</p>
 * </p>
 */

public class Ejercicio4 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Por favor, introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.printf("Los resultados para los números %d y %d\n", num1, num2);
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Mult: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Div: " + (num1 / num2));
        }else {
            System.out.println("Div: ¿En serio? ¿Intentando dividir entre 0?");
            /*
                Si se intenta dividir entre 0, Java dará como resultado "infinity".
                Para evitarlo, se comprueba que el segundo número no es igual a 0.
            */
        }
    }
}
