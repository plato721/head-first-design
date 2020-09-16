package headFirst.compoundDucks;

public class DecoyDuck implements Quackable {
  Observable observable;

  public DecoyDuck() {
    this.observable = new Observable(this);
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }

  public void quack() {
    System.out.println("<sound of the wind>");
    notifyObservers();
  }

  public String toString() {
    return "Decoy Duck";
  }
}
