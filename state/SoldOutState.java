package headFirst.state;

public class SoldOutState implements GumballState {
  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine g) {
    gumballMachine = g;
  }

  public void dispense() {
    System.out.println("Can't dispense without a sale. And gumballs.");
  }

  public void turnCrank() {
    System.out.println("No quarter, no gumballs, no love.");
  }

  public void insertQuarter() {
    System.out.println("Sorry, no gumballs to sell");
  }

  public void ejectQuarter() {
    System.out.println("Nothing to eject");
  }

  public String toString() {
    return "Machine is sold out";
  }
}
