package headFirst.compoundDucks;

import java.util.ArrayList;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator sim = new DuckSimulator();
    sim.run();
  }

  public void run() {
    ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    ducks.add(new QuackCounter(new DarkwingDuck()));
    ducks.add(new QuackCounter(new MallardDuck()));
    ducks.add(new QuackCounter(new RubberDuck()));
    ducks.add(new QuackCounter(new DecoyDuck()));
    ducks.add(new QuackCounter(new DuckCall()));
    ducks.add(new QuackCounter(new GooseAdapter(new Goose())));

    System.out.println("\nDuck Simulator");

    for(Quackable duck : ducks) {
      simulate(duck);
    }

    System.out.println("There were " + QuackCounter.quackCount + " quacks.");
  }

  private void simulate(Quackable duck) {
    duck.quack();
  }

}
