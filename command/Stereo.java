package headFirst.command;

public class Stereo {
  Boolean poweredOn;
  Integer volume;

  public Stereo() {}

  public void on() {
    poweredOn = true;
    System.out.println("Stereo is on");
  }

  public void off() {
    poweredOn = false;
    System.out.println("Stereo is off");
  }

  public void setCD() {
    System.out.println("A random CD has been selected");
  }

  public void unSetCD() {
    System.out.println("CD tray has been emptied. Onto the floor, probably.");
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
    System.out.println("Volume has been turned to " + volume);
  }

  public int getVolume() {
    return volume;
  }
}
