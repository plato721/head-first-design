package headFirst.compoundDucks;

import java.util.ArrayList;

public class DuckSimulator {
  AbstractDuckFactory duckFactory;

  public static void main(String[] args) {
    DuckSimulator sim = new DuckSimulator(new QuackCounterDuckFactory());
    sim.simulate();
  }

  public DuckSimulator(AbstractDuckFactory duckFactory) {
    this.duckFactory = duckFactory;
  }

  public void simulate() {
    DuckFlock allDucks = new DuckFlock();
    DuckFlock mallardFlock = new DuckFlock();

    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());

    allDucks.add(duckFactory.createDarkwingDuck());
    allDucks.add(mallardFlock);
    allDucks.add(duckFactory.createRubberDuck());
    allDucks.add(duckFactory.createDecoyDuck());
    allDucks.add(duckFactory.createDuckCall());
    allDucks.add(new GooseAdapter(new Goose()));

    System.out.println("\nDuck Simulator");

    allDucks.quack();

    System.out.println("There were " + QuackCounter.quackCount + " quacks.");
  }

  private void simulate(Quackable duck) {
    duck.quack();
  }

}
