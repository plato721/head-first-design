package headFirst.command;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;

  public RemoteControl () {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];
    Command nullCommand = new NullCommand();
    for(int i=0; i<7; i++) {
      onCommands[i] = nullCommand;
      offCommands[i] = nullCommand;
    }
  }

  public void programOnCommand(Integer slot, Command command) {
    onCommands[slot] = command;
  }

  public void programOffCommand(Integer slot, Command command) {
    offCommands[slot] = command;
  }

  public void onButtonPushed(Integer slot) {
    onCommands[slot].execute();
  }

  public void offButtonPushed(Integer slot) {
    offCommands[slot].execute();
  }
}
