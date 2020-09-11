package headFirst.proxy;

import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine
    extends UnicastRemoteObject implements GumballMachineRemote {
  public static final long serialVersionUID = 2L;

  public String location;

  public GumballState soldOutState;
  public GumballState noQuarterState;
  public GumballState hasQuarterState;
  public GumballState soldState;
  public GumballState winnerState;

  public GumballState currentState = null;

  int count = 0;

  public GumballMachine (String location, int count) throws RemoteException {
    this.count = count;

    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.location = location;

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

  public int getCount() {
    return count;
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

   public void refill(int count) {
     this.count += count;
     currentState.refill();
   }

  public void releaseBall() {
   if(count > 0) {
     count -=1;
     System.out.println("A gumball comes rolling down the slot...");
   }
  }

  public GumballState getCurrentState() {
    return currentState;
  }

  public String getLocation() {
    return location;
  }

  public String toString() {
    return "Mighty Gumball, Inc.\n" +
    "Java-enabled Standing Gumball Model #2004\n" +
    "Inventory: " + count + " gumballs.\n" +
    currentState.toString() + "\n";
  }
}
