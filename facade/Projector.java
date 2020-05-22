package headFirst.facade;

public class Projector {
  public void on() {
    System.out.println("Top-O-Line Projector on");
  }

  public void off() {
    String output = String.format("%s off", this);
    System.out.println(output);
  }

  public void tvMode() {
    System.out.println("");
  }

  public void wideScreenMode() {
    String output = String.format("%s in widescreen mode (16x9 aspect ratio)", this);
    System.out.println(output);
  }

  public String toString() {
    return "Top-O-Line Projector";
  }
}
