package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();

    CeilingFan ceilingFan = new CeilingFan("Living Room");

    Command ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
    Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
    Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

    remote.programOnCommand(0, ceilingFanMediumCommand);
    remote.programOffCommand(0, ceilingFanOffCommand);

    remote.programOnCommand(1, ceilingFanHighCommand);
    remote.programOffCommand(1, ceilingFanOffCommand);

    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    System.out.println(remote);
    remote.undoButtonPushed();

    remote.onButtonPushed(1);
    System.out.println(remote);
    remote.undoButtonPushed();
  }
}
