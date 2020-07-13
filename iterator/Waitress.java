package headFirst.iterator;
import java.util.Iterator;

public class Waitress {
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void print() {
    allMenus.print();
    System.out.println("\n\n");
  }

  public void printVegetarianMenu() {
    Iterator<MenuComponent> iterator = allMenus.createIterator();

    System.out.println("Vegetarian menu\n-------------------\n");

    while(iterator.hasNext()) {
      try {
        MenuComponent component = iterator.next();
        if(component.isVegetarian()) {
          component.print();
        }
      } catch (UnsupportedOperationException e) { }
    }
  }
}
