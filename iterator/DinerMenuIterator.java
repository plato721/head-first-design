package headFirst.iterator;

public class DinerMenuIterator implements MenuIterator {
  MenuItem[] menuItems;
  int menuIndex = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (menuIndex < menuItems.length) && !(menuItems[menuIndex] == null);
  }

  public MenuItem getNext() {
    MenuItem menuItem = menuItems[menuIndex];
    menuIndex = menuIndex + 1;
    return menuItem;
  }
}
