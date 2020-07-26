package headFirst.state;

public class GumballMachine {
  public GumballState soldOutState;
  public GumballState noQuarterState;
  public GumballState hasQuarterState;
  public GumballState soldState;
  public GumballState winnerState;

  public GumballState currentState = null;

  int count = 0;

  public GumballMachine (int count) {
    this.count = count;

    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    if(count > 1) {
      currentState = noQuarterState;
    } else {
      currentState = soldOutState;
    }
  }

  public GumballState getSoldOutState () {
    return soldOutState;
  }

  public GumballState getNoQuarterState() {
    return noQuarterState;
  }

  public GumballState getHasQuarterState() {
    return hasQuarterState;
  }

  public GumballState getSoldState() {
    return soldState;
  }

  public GumballState getWinnerState() {
    return winnerState;
  }

  public void setState(GumballState newState) {
    currentState = newState;
  }

  public void insertQuarter() {
    currentState.insertQuarter();
  }

  public void turnCrank() {
    currentState.turnCrank();
    currentState.dispense();
  }

  public void ejectQuarter() {
    currentState.ejectQuarter();
  }

   public void dispense() {
     currentState.dispense();
   }

  public void releaseBall() {
   if(count > 0) {
     count -=1;
     System.out.println("A gumball comes rolling down the slot...");
   }
  }

  public void fill(int count) {
    this.count += count;
    if (count > 0 && currentState == getSoldOutState()) {
      currentState = getNoQuarterState();
    }
    System.out.println(currentState);
  }

  public String toString() {
    return "Mighty Gumball, Inc.\n" +
    "Java-enabled Standing Gumball Model #2004\n" +
    "Inventory: " + count + " gumballs.\n" +
    currentState.toString() + "\n";
  }
}
