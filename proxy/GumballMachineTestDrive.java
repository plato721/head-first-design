package headFirst.proxy;

import java.rmi.*;

public class GumballMachineTestDrive {
  public static void main (String[] args) {
    GumballMachine gumballMachine = null;
    int gumballCount;

    if(args.length < 2) {
      System.out.println("Usage is: ");
      System.out.println("java GumballMachineTestDrive <location> <gumball count>");
      System.exit(1);
    }


    try {
      gumballCount = Integer.parseInt(args[1]);
      gumballMachine = new GumballMachine(args[0], gumballCount);
      Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
