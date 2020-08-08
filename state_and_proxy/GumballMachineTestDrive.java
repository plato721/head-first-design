package headFirst.state;

import java.rmi.*;

public class GumballMachineTestDrive {
  public static void main (String[] args) throws RemoteException {
    GumballMachine g = new GumballMachine("Allentown", 5);

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
