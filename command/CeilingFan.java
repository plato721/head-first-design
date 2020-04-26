package headFirst.command;

public class CeilingFan {
  String speed;

  public CeilingFan() {}

  public void high() {
    this.speed = "High";
    alertSettingChanged();
  }

  public void medium() {
    this.speed = "Medium";
    alertSettingChanged();
  }

  public void low() {
    this.speed = "Low";
    alertSettingChanged();
  }

  public void off() {
    this.speed = "Off";
    alertSettingChanged();
  }

  public String getSpeed() {
    return this.speed;
  }

  public void alertSettingChanged() {
    System.out.println("Fan has been set to " + this.speed);
  }
}
