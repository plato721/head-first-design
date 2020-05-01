package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();

    CeilingFan ceilingFan = new CeilingFan("Living Room");
    Stereo stereo = new Stereo();

    remote.programOnCommand(0, ceilingFan::medium);
    remote.programOffCommand(0, ceilingFan::off);

    remote.programOnCommand(1, ceilingFan::high);
    remote.programOffCommand(1, ceilingFan::off);

    Command stereoOn = () -> {
      stereo.on(); stereo.setCD(); stereo.setVolume(11); 
    };

    remote.programOnCommand(2, stereoOn);
    remote.programOffCommand(2, stereo::off);

    System.out.println(remote);
    remote.onButtonPushed(0);
    remote.offButtonPushed(0);

    remote.onButtonPushed(1);
    remote.offButtonPushed(1);

    remote.onButtonPushed(2);
    remote.offButtonPushed(2);
  }
}
