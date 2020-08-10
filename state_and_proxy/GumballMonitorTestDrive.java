package headFirst.state;

import java.rmi.*;

public class GumballMonitorTestDrive {
  public static void main(String[] args) {
    String[] locations = {
      "rmi://santafe.mightygumball.com/gumballmachine",
      "rmi://boulder.mightygumball.com/gumballmachine",
      "rmi://seattle.mightygumball.com/gumballmachine"
    };

    GumballMonitor[] monitors = new GumballMonitor[locations.length];

    for (int i=0; i < locations.length; i++) {
      try {
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
        monitors[i] = new GumballMonitor(machine);

      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    for (int i=0; i < locations.length; i++ ) {
      monitors[i].report();
    }
  }
}
