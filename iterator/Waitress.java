package headFirst.iterator;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    printLunchMenu();
    printVegetarianMenu();
  }

  public void printLunchMenu() {
    MenuIterator menuIterator = dinerMenu.getIterator();
    while(menuIterator.hasNext()){
      System.out.println("entered hasNext in print lunch");
      System.out.println(menuIterator.getNext());
    }
  }

  public void printVegetarianMenu() {
  }

  public boolean isItemVegetarian(MenuItem menuItem) {
    return menuItem.isVegetarian();
  }
}
