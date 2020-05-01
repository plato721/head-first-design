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
    alertSettingChanged("high");
  }

  public void medium() {
    this.speed = MEDIUM;
    alertSettingChanged("medium");
  }

  public void low() {
    this.speed = LOW;
    alertSettingChanged("low");
  }

  public void off() {
    this.speed = OFF;
    alertSettingChanged("off");
  }

  public Integer getSpeed() {
    return this.speed;
  }

  public void alertSettingChanged(String speedWord) {
    System.out.println("Fan has been set to " + speedWord);
  }
}
