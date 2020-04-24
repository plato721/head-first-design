package headFirst.command;

public class RemoteDemo {
  public static void main(String[] args) {
    System.out.println("Running the thing!");

    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);

    RemoteControl remote = new RemoteControl();
    remote.programSlot(lightOnCommand);
    remote.buttonPushed();
  }
}
