package headFirst.compoundDucks;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator sim = new DuckSimulator();
    sim.run();
  }

  public void run() {
    Quackable darkwing = new QuackCounter(new DarkwingDuck());
    Quackable mallard = new QuackCounter(new MallardDuck());
    Quackable rubber = new QuackCounter(new RubberDuck());
    Quackable decoy = new QuackCounter(new DecoyDuck());
    Quackable call = new QuackCounter(new DuckCall());
    Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));

    System.out.println("\nDuck Simulator");

    simulate(darkwing);
    simulate(mallard);
    simulate(rubber);
    simulate(decoy);
    simulate(call);
    simulate(goose);

    System.out.println("There were " + QuackCounter.quackCount + " quacks.");
  }

  private void simulate(Quackable duck) {
    duck.quack();
  }

}
