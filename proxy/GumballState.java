package headFirst.state;

import java.io.*;

public interface GumballState extends Serializable {
  public void turnCrank();
  public void insertQuarter();
  public void ejectQuarter();
  public void dispense();
  public void refill();
}
