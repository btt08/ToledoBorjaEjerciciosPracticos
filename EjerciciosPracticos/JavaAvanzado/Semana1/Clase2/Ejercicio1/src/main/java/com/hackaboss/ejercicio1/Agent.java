package com.hackaboss.ejercicio1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agent extends Thread {

  private final String name;
  private int timeTaken;

  public Agent(String name) {
    this.name = name;
    this.timeTaken = 0;
  }

  private int generateMilliseconds() {
    int milliseconds = new Random().nextInt(5) + 1;
    timeTaken += milliseconds;
    return milliseconds*1000;
  }

  @Override
  public void run() {
    try {
      System.out.println(this.name + " descuelga el teléfono");
      Thread.sleep(generateMilliseconds());
      System.out.println(this.name + " registra datos del usuario");
      Thread.sleep(generateMilliseconds());
      System.out.println(this.name + " ha finalizado la llamada en "
        + timeTaken + " segundos");
      
    } catch (InterruptedException ex) {
      Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
