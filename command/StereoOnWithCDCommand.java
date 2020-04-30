package headFirst.command;

public class StereoOnWithCDCommand implements Command {
  Stereo stereo;
  int prevVolume;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    prevVolume = stereo.getVolume();
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  public void undo() {
    stereo.setVolume(prevVolume);
    stereo.unSetCD();
    stereo.off();
  }
}
