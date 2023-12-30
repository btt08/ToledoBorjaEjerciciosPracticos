package com.hackaboss.ejercicio1;

/**
 * <h1>Ejercicio Nº 1 - Simulación de un centro de atención al cliente</h1>
 * <ul>
 * <li>Crea una simulación de un centro de atención al cliente en la que varios
 * agentes de soporte pueden atender llamadas telefónicas concurrentemente.</li>
 * <li>Cada agente se representa como un hilo independiente.</li>
 * <li>Los agentes deben recibir llamadas de clientes, resolver consultas y
 * registrar información sobre cada llamada. Utiliza hilos para simular la
 * atención concurrente de múltiples llamadas y garantizar que los agentes
 * puedan manejarlas de manera eficiente.</li>
 * <li>Asegúrate de controlar la concurrencia para evitar conflictos en la
 * asignación de llamadas a los agentes.</li>
 * </ul>
 *
 * @author Borja Toledo
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    Agent agent1 = new Agent("Agente1");
    Agent agent2 = new Agent("Agente2");
    
    agent1.start();
    agent2.start();
    
  }
}
