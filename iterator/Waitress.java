package headFirst.iterator;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    printBreakfastMenu();
    printLunchMenu();
  }

  public void printBreakfastMenu() {
    MenuIterator menuIterator = pancakeHouseMenu.getIterator();
    printMenu(menuIterator);
  }

  public void printLunchMenu() {
    MenuIterator menuIterator = dinerMenu.getIterator();
    printMenu(menuIterator);
  }

  public void printVegetarianMenu() {
    MenuIterator menuIterator = pancakeHouseMenu.getIterator();
    printVegetarianMenu(menuIterator);

    menuIterator = dinerMenu.getIterator();
    printVegetarianMenu(menuIterator);
  }

  public boolean isItemVegetarian(MenuItem menuItem) {
    return menuItem.isVegetarian();
  }

  private void printMenu(MenuIterator menuIterator) {
    while(menuIterator.hasNext()){
      System.out.println(menuIterator.getNext());
    }
  }

  private void printVegetarianMenu(MenuIterator menuIterator) {
    MenuItem curItem = null;
    while(menuIterator.hasNext()){
      curItem = menuIterator.getNext();
      if(curItem.isVegetarian()){ System.out.println(curItem); }
    }
  }
}
