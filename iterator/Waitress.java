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
    while(menuIterator.hasNext()){
      System.out.println(menuIterator.getNext());
    }
  }
  public void printLunchMenu() {
    MenuIterator menuIterator = dinerMenu.getIterator();
    while(menuIterator.hasNext()){
      System.out.println(menuIterator.getNext());
    }
  }

  public void printVegetarianMenu() {
    MenuIterator menuIterator = pancakeHouseMenu.getIterator();
    MenuItem curItem = null;
    while(menuIterator.hasNext()){
      curItem = menuIterator.getNext();
      if(curItem.isVegetarian()){ System.out.println(curItem); }
    }
    menuIterator = dinerMenu.getIterator();
    while(menuIterator.hasNext()){
      curItem = menuIterator.getNext();
      if(curItem.isVegetarian()){ System.out.println(curItem); }
    }
  }

  public boolean isItemVegetarian(MenuItem menuItem) {
    return menuItem.isVegetarian();
  }
}
