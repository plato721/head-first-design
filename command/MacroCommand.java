package headFirst.command;

class MacroCommand implements Command {
  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  public void execute() {
    for (Command command : commands) {
      command.execute();
    }
    return;
  }

  public void undo() {
    for (Command command : commands) {
      command.undo();
    }
    return;
  }
}
