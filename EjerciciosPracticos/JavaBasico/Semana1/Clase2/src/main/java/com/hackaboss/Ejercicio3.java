package com.hackaboss;

import java.util.Arrays;
import java.util.Scanner;

/**
 *<h1>
 * Ejercicio N&ordm; 3 - Arreglos: Vectores - Individual
 *</h1>
 *
 *<p>
 * Una web de meteorología necesita de un programa que,
 * al ingresar las 7 temperaturas máximas de la última semana,
 * calcule la temperatura máxima promedio que hubo.
 *</p>
 *<p>
 * Para ello, deberá manejar un vector donde en cada posición
 * se almacene la correspondiente temperatura máxima de cada día.
 * Una vez almacenadas las temperaturas, deberá calcular
 * el promedio de las mismas recorriendo el vector y mostrando
 * el resultado por pantalla.
 *</p>
 */

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] maxTemps = new double[7];

        for (int i = 0;i < 7;i++){
            System.out.printf("Introduce temperatura del día %d: ", i +1);
            maxTemps[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (double temp : maxTemps)
            sum += temp;

        System.out.println("La media fue: " + (sum / maxTemps.length));
    }
}
