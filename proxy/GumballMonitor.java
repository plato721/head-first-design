package headFirst.proxy;

import java.rmi.*;

public class GumballMonitor {
  GumballMachineRemote gumballMachineRemote;

  public GumballMonitor (GumballMachineRemote gumballMachineRemote) {
    this.gumballMachineRemote = gumballMachineRemote;
  }

  public void report() {
    try {
    System.out.println("Machine is in " + gumballMachineRemote.getLocation());
    System.out.println("Current Inventory: " + gumballMachineRemote.getCount() + " gumballs");
    System.out.println("Current State: " + gumballMachineRemote.getCurrentState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
