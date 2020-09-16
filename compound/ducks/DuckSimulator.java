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

    DuckFlock mallardFlock = new DuckFlock();

    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());
    mallardFlock.add(duckFactory.createMallardDuck());

    DuckFlock allDucks = new DuckFlock();

    allDucks.add(duckFactory.createDarkwingDuck());
    allDucks.add(duckFactory.createRubberDuck());
    allDucks.add(duckFactory.createDecoyDuck());
    allDucks.add(duckFactory.createDuckCall());
    allDucks.add(new GooseAdapter(new Goose()));
    allDucks.add(mallardFlock);

    Observer quackologist = new Quackologist();
    allDucks.registerObserver(quackologist);

    System.out.println("\nDuck Simulator\n------------");

    System.out.println("Mallards Only:");
    mallardFlock.quack();

    System.out.println("\nAll da ducks:");
    allDucks.quack();

    System.out.println("There were " + QuackCounter.quackCount + " quacks.");
  }

  private void simulate(Quackable duck) {
    duck.quack();
  }

}
