package headFirst.command;

public class CeilingFan {
  public static final int HIGH = 5;
  public static final int MEDIUM = 3;
  public static final int LOW = 1;
  public static final int OFF = 0;

  int speed;
  String location;

  public CeilingFan(String location) {
    this.location = location;
  }

  public void high() {
    this.speed = HIGH;
    alertSettingChanged();
  }

  public void medium() {
    this.speed = MEDIUM;
    alertSettingChanged();
  }

  public void low() {
    this.speed = LOW;
    alertSettingChanged();
  }

  public void off() {
    this.speed = OFF;
    alertSettingChanged();
  }

  public Integer getSpeed() {
    return this.speed;
  }

  public void alertSettingChanged() {
    System.out.println("Fan has been set to " + this.speed);
  }
}
