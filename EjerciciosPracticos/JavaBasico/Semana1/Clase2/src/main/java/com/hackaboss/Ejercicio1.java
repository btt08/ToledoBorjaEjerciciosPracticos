package com.hackaboss;

import java.util.Scanner;

/**
 *<h1>
 * Ejercicio N&ordm; 1 - Estructuras Condicionales - Individual
 *</h1>
 *
 *<p>
 * a) Una recital permite únicamente el ingreso de mayores de 18 años.
 * Para ello necesita un programa que, a partir de que un usuario ingrese
 * su edad, determine mediante un mensaje en pantalla si la persona puede o no
 * ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando
 * la situación.
 *</p>
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ADULT_AGE = 18;

        System.out.println("Introduzca su edad: ");
        int age = sc.nextInt();

        if (age >= ADULT_AGE)
            System.out.println("Puede ingresar al evento");
        else
            System.out.println("No puede ingresar, por favor, vuelva cuando sea mayor de edad");
    }
}