package headFirst.compoundDucks;

public class RubberDuck implements Quackable {
  Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }

  public void quack() {
    System.out.println("Squeak");
    observable.notifyObservers();
  }

  public String toString() {
    return "Rubber Ducky";
  }
}
