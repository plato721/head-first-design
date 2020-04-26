package headFirst.command;

public class Light {
  Boolean on = false;
  String location;

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    on = true;
    System.out.println(location + " light is on");
  }

  public void off() {
    on = false;
    System.out.println(location + " light is off");
  }

  public boolean isLightOn() {
    return on;
  }
}
