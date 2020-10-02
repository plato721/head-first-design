package headFirst.compoundDucks;

public class QuackCounterDuckFactory extends AbstractDuckFactory {
  public Quackable createMallardDuck(){
    return wrapWithCountable(new MallardDuck());
  }

  public Quackable createDarkwingDuck(){
    return wrapWithCountable(new DarkwingDuck());
  }

  public Quackable createDecoyDuck(){
    return wrapWithCountable(new DecoyDuck());
  }

  public Quackable createRubberDuck(){
    return wrapWithCountable(new RubberDuck());
  }

  public Quackable createDuckCall(){
    return wrapWithCountable(new DuckCall());
  }

  private Quackable wrapWithCountable(Quackable duck) {
    return new QuackCounter(duck);
  }
}
