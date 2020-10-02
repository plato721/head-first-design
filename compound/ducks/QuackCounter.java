package headFirst.compoundDucks;

public class QuackCounter implements Quackable {
  public static int quackCount;
  Quackable duck;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  public void quack() {
    duck.quack();
    quackCount++;
  }

  public void notifyObservers() {
    duck.notifyObservers();
  }

  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }
}
