package headFirst.state;

public class GumballMachine {
  public static int SOLD_OUT = 0;
  public static int NO_QUARTER = 1;
  public static int HAS_QUARTER = 2;
  public static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public GumballMachine (int count) {
    this.count = count;
    if(count > 0) {
      state = NO_QUARTER;
    }
  }

  public void insertQuarter() {
    if (state == SOLD_OUT){
      System.out.println("I wouldn't bother, there's no gumballs to sell.");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println(stateString());
      return;
    } else if (state == HAS_QUARTER) {
      System.out.println("You already inserted a quarter.");
    } else if (state == SOLD) {
      System.out.println("Hang tight while we give you the gumball you just bought.");
    }
  }

  public void ejectQuarter() {
    if (state == SOLD_OUT){
      System.out.println("Nothing to eject.");
    } else if (state == NO_QUARTER) {
      System.out.println("Nothing to eject.");
    } else if (state == HAS_QUARTER) {
      state = NO_QUARTER;
      System.out.println("No worries, here's your quarter.");
      return;
    } else if (state == SOLD) {
      System.out.println("Sorry, all sales final. Gumball vending now.");
    }
  }

  public void turnCrank() {
    if (state == HAS_QUARTER) {
      state = SOLD;
      System.out.println(stateString());
      dispense();
    } else {
      System.out.println("no");
    }
  }

  public void dispense() {
    if (state == SOLD) {
      System.out.println("A gumball comes rolling out the slot");
      count -= 1;
      if (count > 0) {
        state = NO_QUARTER;
      } else {
        state = SOLD_OUT;
      }
      System.out.println(stateString());
    } else {
      System.out.println("no");
    }
  }

  public void fill(int count) {
    this.count += count;
    if (count > 0 && state == SOLD_OUT) {
      state = NO_QUARTER;
    }
    System.out.println(stateString());
  }

  public String toString() {
    return "Mighty Gumball, Inc.\n" +
    "Java-enabled Standing Gumball Model #2004\n" +
    "Inventory: " + count + " gumballs.\n" +
    stateString() + "\n";
  }

  public String stateString() {
    String output = "";
    if (state == SOLD_OUT) {
      output = "Machine is sold out";
    } else if (state == NO_QUARTER) {
      output = "Machine is waiting for a quarter";
    } else if (state == HAS_QUARTER) {
      output = "You inserted a quarter";
    } else if (state == SOLD) {
      output = "You turned...";
    }
    return output;
  }
}
