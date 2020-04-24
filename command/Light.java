package headFirst.command;

public class Light {
  Boolean on = false;

  public void turnOn() {
    on = true;
    System.out.println("Light has been turned on!");
  }

  public void turnOff() {
    on = false;
  }

  public boolean isLightOn() {
    return on;
  }
}
