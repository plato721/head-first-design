package headFirst.state;

public class GumballMachineTestDrive {
  public static void main (String[] args) {
    GumballMachine g = new GumballMachine(5);

    System.out.println(g);

    g.insertQuarter();
    g.turnCrank();

    System.out.println(g);

    g.insertQuarter();
    g.ejectQuarter();
    g.turnCrank();

    System.out.println(g);

    g.insertQuarter();
    g.turnCrank();
    g.insertQuarter();
    g.turnCrank();
    g.ejectQuarter();

    System.out.println(g);

    g.insertQuarter();
    g.insertQuarter();
    g.turnCrank();
    g.insertQuarter();
    g.turnCrank();
    g.insertQuarter();
    g.turnCrank();

    System.out.println(g);
  }
}
