package headFirst.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
  MenuItem[] menuItems;
  int menuIndex = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (menuIndex < menuItems.length) && !(menuItems[menuIndex] == null);
  }

  public MenuItem next() {
    MenuItem menuItem = menuItems[menuIndex];
    menuIndex = menuIndex + 1;
    return menuItem;
  }

  public void remove() {
    if (menuIndex <= 0) {
      throw new IllegalStateException
        ("You can't remove an item until you've done at least one next()");
    }
    if (menuItems[menuIndex-1] != null) {
      for (int i=(menuIndex-1); i<(menuItems.length-1); i++){
        menuItems[i] = menuItems[i+1];
      }
      menuItems[menuItems.length-1] = null;
    }
  }
}
