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
    printIterator(menuIterator);
  }

  public void printLunchMenu() {
    MenuIterator menuIterator = dinerMenu.getIterator();
    printIterator(menuIterator);
  }

  public void printVegetarianMenu() {
    MenuIterator menuIterator = pancakeHouseMenu.getIterator();
    printVegetarianIterator(menuIterator);

    menuIterator = dinerMenu.getIterator();
    printVegetarianIterator(menuIterator);
  }

  public boolean isItemVegetarian(MenuItem menuItem) {
    return menuItem.isVegetarian();
  }

  private void printIterator(MenuIterator menuIterator) {
    while(menuIterator.hasNext()){
      System.out.println(menuIterator.getNext());
    }
  }

  private void printVegetarianIterator(MenuIterator menuIterator) {
    MenuItem curItem = null;
    while(menuIterator.hasNext()){
      curItem = menuIterator.getNext();
      if(curItem.isVegetarian()){ System.out.println(curItem); }
    }
  }
}
