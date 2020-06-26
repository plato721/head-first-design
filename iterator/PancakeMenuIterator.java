package headFirst.iterator;
import java.util.ArrayList;

public class PancakeMenuIterator implements MenuIterator {
  ArrayList<MenuItem> menuItems;
  int menuIndex = 0;

  public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (menuIndex < menuItems.size()) && !(menuItems.get(menuIndex) == null);
  }

  public MenuItem getNext() {
    MenuItem menuItem = menuItems.get(menuIndex);
    menuIndex = menuIndex + 1;
    return menuItem;
  }
}
