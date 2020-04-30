package headFirst.command;

public class CeilingFanHighCommand extends CeilingFanCommand implements Command {
  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }
}
