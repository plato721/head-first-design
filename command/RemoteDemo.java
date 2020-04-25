package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    System.out.println("Running the thing!");

    RemoteControl remote = new RemoteControl();

    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOnCommand(light);

    remote.programOnCommand(0, lightOnCommand);
    remote.programOffCommand(0, lightOffCommand);
    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    remote.onButtonPushed(0);

    Stereo stereo = new Stereo();
    Command stereoOnCommand = new StereoOnWithCDCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);

    remote.programOnCommand(1, stereoOnCommand);
    remote.programOffCommand(1, stereoOffCommand);
    remote.onButtonPushed(1);
    remote.offButtonPushed(1);
    remote.onButtonPushed(1);
  }
}
