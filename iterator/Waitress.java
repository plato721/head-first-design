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
    MenuIterator menuIterator = pancakeHouseMenu.createIterator();
    printMenu(menuIterator);
  }

  public void printLunchMenu() {
    MenuIterator menuIterator = dinerMenu.createIterator();
    printMenu(menuIterator);
  }

  public void printVegetarianMenu() {
    MenuIterator menuIterator = pancakeHouseMenu.createIterator();
    printVegetarianMenu(menuIterator);

    menuIterator = dinerMenu.createIterator();
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
