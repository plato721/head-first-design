package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    System.out.println("Running the thing!");

    RemoteControl remote = new RemoteControl();

    Light lrLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");

    Command lrLightOnCommand = new LightOnCommand(lrLight);
    Command lrLightOffCommand = new LightOffCommand(lrLight);

    Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
    Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);

    Stereo stereo = new Stereo();
    Command stereoOnCommand = new StereoOnWithCDCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);

    remote.programOnCommand(0, lrLightOnCommand);
    remote.programOffCommand(0, lrLightOffCommand);

    remote.programOnCommand(1, kitchenLightOnCommand);
    remote.programOffCommand(1, kitchenLightOffCommand);

    remote.programOnCommand(2, stereoOnCommand);
    remote.programOffCommand(2, stereoOffCommand);

    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    remote.onButtonPushed(0);

    remote.onButtonPushed(1);
    remote.offButtonPushed(1);
    remote.onButtonPushed(1);

    remote.onButtonPushed(2);
    remote.offButtonPushed(2);
    remote.onButtonPushed(2);
  }
}
