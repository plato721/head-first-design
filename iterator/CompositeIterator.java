package headFirst.iterator;
import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
  Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

  public CompositeIterator(Iterator iterator) {
    stack.push(iterator);
  }

  public MenuComponent next() {
    if(!hasNext()){ return null; }

    Iterator<MenuComponent> iterator = stack.peek();
    MenuComponent component = iterator.next();

    stack.push(component.createIterator());

    return component;
  }

  public boolean hasNext() {
    if(stack.empty()){ return false; }

    if(stack.peek().hasNext()){
      return true;
    } else {
      stack.pop();
      return hasNext();
    }
  }
}
