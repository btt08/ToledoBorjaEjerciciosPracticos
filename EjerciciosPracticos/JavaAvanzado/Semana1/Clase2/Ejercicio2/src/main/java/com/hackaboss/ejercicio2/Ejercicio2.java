package com.hackaboss.ejercicio2;

/**
 * <h1>Ejercicio Nº 2 - Simulación de cadena de producción</h1>
 * <ul>
 *  <li>Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente,</li>
 *  <li>Cada trabajador se representa como un hilo independiente.</li>
 *  <li>Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.</li>
 *  <li>Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.</li>
 *  <li>Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.</li>
 * </ul>
 * @author Borja Toledo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1");
        Worker worker2 = new Worker("Worker2");
        
        worker1.start();
        worker2.start();
    }
}
