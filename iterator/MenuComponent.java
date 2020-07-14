package headFirst.iterator;
import java.util.Iterator;

public abstract class MenuComponent {
  // composite operations begin
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public MenuComponent getChild(int child) {
    throw new UnsupportedOperationException();
  }
  // end composite operations

  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public void print() {
    throw new UnsupportedOperationException();
  }

  public Iterator createIterator() {
    return new NullIterator();
  }
}
