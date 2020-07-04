package headFirst.iterator;
import java.util.HashMap;
import java.util.Iterator;

public class SteakHouseMenu implements Menu {
  HashMap<String, MenuItem> menuItems;

  public SteakHouseMenu() {
    this.menuItems = new HashMap<String, MenuItem>();
    buildMenu();
  }

  private void buildMenu() {
    MenuItem menuItem = new MenuItem(
      "Porterhouse",
      "It's a house large enough to warrant having a porter on staff.",
      false,
      55
    );
    addMenuItem(menuItem);

    menuItem = new MenuItem(
      "T-Bone",
      "A boneless, skinless, cutlet... What do you think it is? It's a steak. With a bone in it. That resembles a T.",
      false,
      40
    );
    addMenuItem(menuItem);
  }

  public void addMenuItem(MenuItem menuItem) {
    menuItems.put(menuItem.getName(), menuItem);
  }

  public Iterator createIterator() {
    return menuItems.values().iterator();
  }

}
