package com.hackaboss;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *<h1>
 * Ejercicio N&ordm; 3 - Variables y Operadores - Individual
 *</h1>
 *
 *<p>
 * Escribe un programa que permita calcular el área de un triángulo
 * y luego mostrar el resultado por pantalla..
 * Recuerda que la fórmula para calcular esto es:
 * (base * altura) / 2 (base por altura dividido dos).
 *</p>
 *
 * <p>Pista: Debes declarar variables para la base y la altura
 * del triángulo, asignarles valores y luego calcular el área
 * utilizando la fórmula.
 * </p>
 */
public class Ejercicio3 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Por favor, introduce la base: ");
            double base = sc.nextDouble();

            System.out.println("Por favor, introduce la altura: ");
            double height = sc.nextDouble();

            System.out.println("El área del triángulo es: " + ((base * height) /2));
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un valor no válido. El programa se cerrará");
        } finally{
            sc.close();
        }
    }
}
