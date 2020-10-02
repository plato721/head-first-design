package headFirst.compoundDucks;

import java.util.ArrayList;
import java.util.Iterator;

public class DuckFlock implements Quackable {
  ArrayList<Quackable> quackers = new ArrayList<Quackable>();
  Observable observable;

  public DuckFlock() {
    this.observable = new Observable(this);
  }

  public void add(Quackable quackable) {
    quackers.add(quackable);
  }

  public void notifyObservers(){
    observable.notifyObservers();
  }

  public void registerObserver(Observer observer) {
    Iterator<Quackable> iterator = quackers.iterator();

    while (iterator.hasNext()) {
      Quackable quacker = iterator.next();
      quacker.registerObserver(observer);
    }
  }

  public void quack(){
    Iterator<Quackable> iterator = quackers.iterator();

    while (iterator.hasNext()) {
      Quackable quacker = iterator.next();
      quacker.quack();
    }
  }
}
