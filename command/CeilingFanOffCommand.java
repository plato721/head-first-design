package headFirst.command;

public class CeilingFanOffCommand extends CeilingFanCommand implements Command {
  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    super(ceilingFan);
  }

  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }
}
