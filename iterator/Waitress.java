package headFirst.iterator;

import java.util.Iterator;

public class Waitress {
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void print() {
    allMenus.print();
  }
}
