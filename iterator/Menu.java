package headFirst.iterator;
import java.util.Iterator;

public class Menu extends MenuComponent {
  public ArrayList<MenuComponent> menuComponents;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int index) {
    return menuComponents.get(index);
  }

  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("-------------------------");

    Iterator<MenuComponent> iterator = menuComponents.iterator();

    while(iterator.hasNext()) {
      MenuComponent menuComponent = menuIterator.next();
      menuComponent.print();
    }
  }
}
