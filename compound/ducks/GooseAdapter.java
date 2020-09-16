package headFirst.compoundDucks;

public class GooseAdapter implements Quackable {
  Goose goose;
  Observable observable;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
    this.observable = new Observable(this);
  }

  public void quack() {
    goose.honk();
    notifyObservers();
  }

  public void notifyObservers(){
    observable.notifyObservers();
  }

  public void registerObserver(Observer observer){
    observable.registerObserver(observer);
  }

  public String toString() {
    return "Goose masquerading as a duck";
  }
}
