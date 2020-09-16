package headFirst.compoundDucks;

public class DarkwingDuck implements Quackable {
  Observable observable;

  public DarkwingDuck() {
    this.observable = new Observable(this);
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }

  public void quack() {
    System.out.println("Quack!");
    notifyObservers();
  }

  public String toString() {
    return "Darkwing Duck";
  }
}
