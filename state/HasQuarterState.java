package headFirst.state;

public class HasQuarterState implements GumballState {
  GumballMachine gumballMachine;

  public HasQuarterState (GumballMachine g) {
    gumballMachine = g;
  }

   public void turnCrank(){
     System.out.println("Turning the crank");
     gumballMachine.setState(gumballMachine.getSoldState());
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

   public String toString() {
     return "You inserted a quarter";
   }
}
