package headFirst.facade;

public class TheaterLights {
  public void on() {
    System.out.println("Theater Ceiling Lights on");
  }

  public void off() {
    System.out.println("");
  }

  public void dim(Integer percentage) {
    System.out.println("Theater Ceiling Lights dimming to " + percentage + "%");
  }

  public String toString() {
    return "";
  }
}
