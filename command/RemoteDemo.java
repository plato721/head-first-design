package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    System.out.println("Running the thing!");

    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOnCommand(light);

    RemoteControl remote = new RemoteControl();
    remote.programOnCommand(0, lightOnCommand);
    remote.programOffCommand(0, lightOffCommand);
    remote.onButtonPushed(0);
    remote.offButtonPushed(0);
    remote.onButtonPushed(0);
  }
}
