package headFirst.iterator;
import java.util.Iterator;

public class NullIterator implements Iterator {
  public Object next() {
    return null;
  }

  public boolean hasNext() {
    return false;
  }
}
