package headFirst.proxy;

import java.lang.System;
import java.util.Random;

public class HasQuarterState implements GumballState {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;
  Random random = new Random(System.currentTimeMillis());

  public HasQuarterState (GumballMachine g) {
    gumballMachine = g;
  }

   public void turnCrank(){
     System.out.println("Turning the crank");

     if (random.nextInt(10) == 0) {
       gumballMachine.setState(gumballMachine.getWinnerState());
     } else {
       gumballMachine.setState(gumballMachine.getSoldState());
     }
   }

   public void insertQuarter() {
     System.out.println("Quarter already inserted");
   }

   public void ejectQuarter() {
     System.out.println("Ejecting quarter");
     gumballMachine.setState(gumballMachine.getNoQuarterState());
   }

   public void dispense() {
     System.out.println("Will dispense after crank turned.");
   }

   public void refill() {
     System.out.println("Gumballs filled! Current count is: " + gumballMachine.getCount());
   }

   public String toString() {
     return "You inserted a quarter";
   }
}
