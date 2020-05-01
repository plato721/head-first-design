package headFirst.command;

public class StereoOffCommand implements Command {
  Stereo stereo;
  int prevVolume;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    prevVolume = stereo.getVolume();
    stereo.setVolume(0);
    stereo.unSetCD();
    stereo.off();
  }

  public void undo() {
    stereo.on();
    stereo.setVolume(prevVolume);
    stereo.setCD();
  }
}
