package headFirst.command;

public class Light {
  Boolean on = false;

  public void on() {
    on = true;
    System.out.println("Light is on");
  }

  public void off() {
    on = false;
    System.out.println("Light is off");
  }

  public boolean isLightOn() {
    return on;
  }
}
