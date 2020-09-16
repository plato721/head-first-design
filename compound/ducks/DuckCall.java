package headFirst.compoundDucks;

public class DuckCall implements Quackable {
  Observable observable;

  public DuckCall() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("Kwack");
    observable.notifyObservers();
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }

  public String toString() {
    return "Duck call";
  }
}
