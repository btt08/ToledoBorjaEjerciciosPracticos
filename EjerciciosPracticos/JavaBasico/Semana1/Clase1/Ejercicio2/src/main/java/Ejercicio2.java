/**
 *<h1>
 * Ejercicio N&ordm; 2 - Tipos de Datos - Grupal
 *</h1>
 *
 *<p>
 * a) Crea un programa que declare una variable para cada uno
 * de los siguientes tipos de datos:
 * int, double, boolean y String.
 * Asigna un valor a cada variable y muestra su contenido en la consola.
 * </p>
 * <p>
 * b) Ahora, asigna valores que no correspondan al tipo de dato.
 * Por ejemplo, un int en un String o un String en un double&hellip;
 * &iquest;Qu&eacute; sucede con el programa? &iquest;Se produce alg&uacute;n error?
 * &iquest;En qu&eacute; situaciones se genera error y en cu&aacute;les no?
 * Justificar el por qu&eacute; de cada caso. Debatir con otros compa&ntilde;eros.
 *</p>
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int integer = 5;
        double decimal = 3.141592;
        boolean flag = false;
        String text = "Cadena de caracteres";
        System.out.println("Lista de valores: ");
        System.out.println("\tInt: " + integer);
        System.out.println("\tDouble: " + decimal);
        System.out.println("\tBoolean: " + flag);
        System.out.println("\tString: " + text);
    }
}
/*
    Al intentar asignar valores que no corresponden con el tipo declarado
    el IDE da un error y no deja compilar. En casos en los que los tipos sean compatibles
    entre ellos, se puede asignar. Por ejemplo, el número 5 es válido tanto para
    int como para byte, short, double, etc
*/
