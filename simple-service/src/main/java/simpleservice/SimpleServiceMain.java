package simpleservice;

import org.rapidpm.microservice.Main;

public class SimpleServiceMain {

  public static void main(String[] args) {
    Main.deploy();
  }

  public void stop() {
    Main.stop();
    System.exit(1);
  }

}
