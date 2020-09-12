package headFirst.compoundDucks;

import java.util.ArrayList;

public class DuckSimulator {
  AbstractDuckFactory duckFactory;

  public static void main(String[] args) {
    DuckSimulator sim = new DuckSimulator(new QuackCounterDuckFactory());
    sim.run();
  }

  public DuckSimulator(AbstractDuckFactory duckFactory) {
    this.duckFactory = duckFactory;
  }

  public void run() {
    ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    ducks.add(duckFactory.createDarkwingDuck());
    ducks.add(duckFactory.createMallardDuck());
    ducks.add(duckFactory.createRubberDuck());
    ducks.add(duckFactory.createDecoyDuck());
    ducks.add(duckFactory.createDuckCall());
    ducks.add(new GooseAdapter(new Goose()));

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
