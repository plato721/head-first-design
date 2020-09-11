package headFirst.compoundDucks;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator sim = new DuckSimulator();
    sim.run();
  }

  public void run() {
    Quackable darkwing = new DarkwingDuck();
    Quackable mallard = new MallardDuck();
    Quackable rubber = new RubberDuck();
    Quackable decoy = new DecoyDuck();
    Quackable call = new DuckCall();
    Quackable goose = new GooseAdapter(new Goose());

    System.out.println("\nDuck Simulator");

    simulate(darkwing);
    simulate(mallard);
    simulate(rubber);
    simulate(decoy);
    simulate(call);
    simulate(goose);
  }

  private void simulate(Quackable duck) {
    duck.quack();
  }

}
