package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    System.out.println("Running the thing!");

    RemoteControl remote = new RemoteControl();

    Light lrLight = new Light("Living Room");
    Command lrLightOnCommand = new LightOnCommand(lrLight);
    Command lrLightOffCommand = new LightOffCommand(lrLight);

    Light kitchenLight = new Light("Kitchen");
    Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
    Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);

    CeilingFan ceilingFan = new CeilingFan();
    Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
    Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

    GarageDoor garageDoor = new GarageDoor();
    Command garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
    Command garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

    Stereo stereo = new Stereo();
    Command stereoOnCommand = new StereoOnWithCDCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);


    remote.programOnCommand(0, lrLightOnCommand);
    remote.programOffCommand(0, lrLightOffCommand);

    remote.programOnCommand(1, kitchenLightOnCommand);
    remote.programOffCommand(1, kitchenLightOffCommand);

    remote.programOnCommand(2, ceilingFanOnCommand);
    remote.programOffCommand(2, ceilingFanOffCommand);

    remote.programOnCommand(3, garageDoorUpCommand);
    remote.programOffCommand(3, garageDoorDownCommand);

    remote.programOnCommand(4, stereoOnCommand);
    remote.programOffCommand(4, stereoOffCommand);

    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    remote.onButtonPushed(0);

    remote.onButtonPushed(1);
    remote.offButtonPushed(1);
    remote.onButtonPushed(1);

    remote.onButtonPushed(2);
    remote.offButtonPushed(2);
    remote.onButtonPushed(2);

    remote.onButtonPushed(3);
    remote.offButtonPushed(3);
    remote.onButtonPushed(3);

    remote.onButtonPushed(4);
    remote.offButtonPushed(4);
    remote.onButtonPushed(4);
  }
}
