package headFirst.facade;

public class DvdPlayer {
  Amplifier amp;
  String movie;

  public void setAmp(Amplifier amp) {
    this.amp = amp;
  }

  public void on() {
    String output = String.format("%s on", this);
    System.out.println(output);
  }

  public void off() {
    String output = String.format("%s off", this);
    System.out.println(output);
  }

  public void eject() {
    String output = String.format("%s eject", this);
    System.out.println(output);
  }

  public void pause() {
    System.out.println("");
  }

  public void play(String movie) {
    this.movie = movie;
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
    String output = String.format("%1$s stopped \"%2$s\"", this, movie);
    System.out.println(output);
  }

  public String toString() {
    return "Top-O-Line DVD Player";
  }
}
