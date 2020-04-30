package headFirst.command;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  Command lastCommand;

  public RemoteControl () {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];
    Command nullCommand = new NullCommand();
    for(int i=0; i<7; i++) {
      onCommands[i] = nullCommand;
      offCommands[i] = nullCommand;
    }
    this.lastCommand = nullCommand;
  }

  public void programOnCommand(Integer slot, Command command) {
    onCommands[slot] = command;
  }

  public void programOffCommand(Integer slot, Command command) {
    offCommands[slot] = command;
  }

  public void onButtonPushed(Integer slot) {
    onCommands[slot].execute();
    lastCommand = onCommands[slot];
  }

  public void offButtonPushed(Integer slot) {
    offCommands[slot].execute();
    lastCommand = offCommands[slot];
  }

  public void undoButtonPushed() {
    lastCommand.undo();
  }

  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot " + i + "] " + commandToString(onCommands[i])
        + "    " + commandToString(offCommands[i]) + "\n");
    }
    stringBuff.append("[undo] " + commandToString(lastCommand));
    return stringBuff.toString();
  }

  private String commandToString(Command command) {
    return command.getClass().getName().replaceAll("headFirst.command.", "");
  }
}
