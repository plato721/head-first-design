package headFirst.state;

public interface GumballState {
  public void turnCrank();
  public void insertQuarter();
  public void ejectQuarter();
  public void dispense();
  public void refill();
}
