package headFirst.iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
  public ArrayList<MenuComponent> menuComponents;
  public Iterator<MenuComponent> iterator = null;
  public String name;
  public String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    this.menuComponents = new ArrayList<MenuComponent>();
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void add(String name, String description,
                      boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    add(menuItem);
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
    System.out.println(": " + getDescription());
    System.out.println("-------------------------");

    Iterator<MenuComponent> iterator = menuComponents.iterator();

    while(iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      menuComponent.print();
    }
  }

  public Iterator createIterator() {
    if (iterator == null) {
      iterator = new CompositeIterator(menuComponents.iterator());
    }
    return iterator;
  }
}
