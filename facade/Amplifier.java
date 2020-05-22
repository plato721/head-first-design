package headFirst.facade;

public class Amplifier {
  Tuner tuner;
  DvdPlayer dvd;
  CdPlayer cdPlayer;
  Integer volume;

  public Amplifier(Tuner tuner, DvdPlayer dvd, CdPlayer cdPlayer) {
    this.tuner = tuner;
    tuner.setAmp(this);

    this.dvd = dvd;
    this.cdPlayer = cdPlayer;
  }

  public void on() {
    String output = String.format("%s on", this);
    System.out.println(output);
    outputDvd();
  }

  public void off() {
    System.out.println("");
  }

  public void setCd() {
    System.out.println("");
  }

  public void outputDvd() {
    String output = String.format("%1$s dvd player set to %2$s", this, dvd);
    System.out.println(output);
  }

  public void setDvd(DvdPlayer dvd) {
    this.dvd = dvd;

    System.out.println("");
  }

  public void setStereoSound() {
    System.out.println("");
  }

  public void setSurroundSound() {
    String output = String.format("%s surround sound on (5 speakers, 1 subwoofer)", this);
    System.out.println(output);
  }

  public void setTuner() {
    System.out.println("");
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
    String message = String.format("%s volume set to %d!", this, volume);
    System.out.println(message);
  }

  public String toString() {
    return "Top-O-Line Amplifier";
  }
}
