package headFirst.command;

public class StereoOffCommand implements Command {
  Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.setVolume(0);
    stereo.unSetCD();
    stereo.off();
  }
}
