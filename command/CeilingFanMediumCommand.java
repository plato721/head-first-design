package headFirst.command;

public class CeilingFanMediumCommand extends CeilingFanCommand implements Command {
  public CeilingFanMediumCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
  }
}
