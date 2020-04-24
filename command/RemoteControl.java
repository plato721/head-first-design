package headFirst.command;

public class RemoteControl {
  Command slot = null;

  public RemoteControl () {
  }

  public void programSlot(Command command) {
    this.slot = command;
  }

  public void buttonPushed() {
    slot.execute();
  }
}
