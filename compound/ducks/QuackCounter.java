package headFirst.compoundDucks;

public class QuackCounter implements Quackable {
  public static int quackCount = 0;
  Quackable duck;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  public void quack() {
    duck.quack();
    quackCount++;
  }
}
