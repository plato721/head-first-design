package headFirst.facade;

public class DvdPlayer {
  Amplifier amp;

  public void setAmp(Amplifier amp) {
    this.amp = amp;
  }

  public void on() {
    String output = String.format("%s on", this);
    System.out.println(output);
  }

  public void off() {
    System.out.println("");
  }

  public void eject() {
    System.out.println("");
  }

  public void pause() {
    System.out.println("");
  }

  public void play(String movie) {
    String message = String.format("%1$s playing the movie \"%2$s\"!", this, movie);
    System.out.println(message);
  }

  public void setSurroundAudio() {
    System.out.println("");
  }

  public void setTwoChannelAudio() {
    System.out.println("");
  }

  public void stop() {
    System.out.println("");
  }

  public String toString() {
    return "Top-O-Line DVD Player";
  }
}
