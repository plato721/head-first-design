package headFirst.compoundDucks;

import java.util.ArrayList;
import java.util.Iterator;

public class DuckFlock implements Quackable {
  ArrayList<Quackable> quackers = new ArrayList<Quackable>();

  public void add(Quackable quackable){
    quackers.add(quackable);
  }

  public void quack(){
    Iterator<Quackable> iterator = quackers.iterator();

    while (iterator.hasNext()) {
      Quackable quacker = iterator.next();
      quacker.quack();
    }
  }
}
