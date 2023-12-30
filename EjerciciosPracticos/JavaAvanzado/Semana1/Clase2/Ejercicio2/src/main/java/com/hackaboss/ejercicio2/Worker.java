package com.hackaboss.ejercicio2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker extends Thread{
  private final String name;
  private int timeTaken;

  public Worker(String name) {
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
      System.out.println(this.name + " ensambla un producto");
      Thread.sleep(generateMilliseconds());
      System.out.println(this.name + " realiza el control de calidad");
      Thread.sleep(generateMilliseconds());
      System.out.println(this.name + " embala el producto");
      Thread.sleep(generateMilliseconds());
      System.out.println(this.name + " ha finalizado sus tareas en "
        + timeTaken + " segundos");
      
    } catch (InterruptedException ex) {
      Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
