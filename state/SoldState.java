package headFirst.state;

public class SoldState implements GumballState {
  public int saleCount = 0;
  public GumballMachine gumballMachine;

  public SoldState (GumballMachine g) {
    gumballMachine = g;
  }

  public void turnCrank() {
    System.out.println("Crank already turned. Processing current sale.");
  }

  public void insertQuarter() {
    System.out.println("Can't take another quarter until current transaction completed.");
  }

  public void ejectQuarter() {
    System.out.println("Unable to reverse transaction at this time. Sale in progress.");
  }

  public void dispense() {
    saleCount += 1;

    if (saleCount % 10 == 0) {
      System.out.println("Winner! Dispensing two gumballs.");
      gumballMachine.releaseBall();
    }
    gumballMachine.releaseBall();

    if (gumballMachine.count > 1) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}
