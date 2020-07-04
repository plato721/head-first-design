package headFirst.iterator;

import java.util.Iterator;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinerMenu;
  Menu steakhouseMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu steakhouseMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.steakhouseMenu = steakhouseMenu;
  }

  public void printMenu() {
    printBreakfastMenu();
    printLunchMenu();
    printDinnerMenu();
  }

  public void printBreakfastMenu() {
    Iterator<MenuItem> menuIterator = pancakeHouseMenu.createIterator();
    printMenu(menuIterator);
  }

  public void printLunchMenu() {
    Iterator<MenuItem> menuIterator = dinerMenu.createIterator();
    printMenu(menuIterator);
  }

  public void printDinnerMenu() {
    Iterator<MenuItem> menuIterator = steakhouseMenu.createIterator();
    printMenu(menuIterator);
  }

  public void printVegetarianMenu() {
    Iterator<MenuItem> menuIterator = pancakeHouseMenu.createIterator();
    printVegetarianMenu(menuIterator);

    menuIterator = dinerMenu.createIterator();
    printVegetarianMenu(menuIterator);
  }

  public boolean isItemVegetarian(MenuItem menuItem) {
    return menuItem.isVegetarian();
  }

  private void printMenu(Iterator<MenuItem> menuIterator) {
    while(menuIterator.hasNext()){
      System.out.println(menuIterator.next());
    }
  }

  private void printVegetarianMenu(Iterator<MenuItem> menuIterator) {
    MenuItem curItem = null;
    while(menuIterator.hasNext()){
      curItem = menuIterator.next();
      if(curItem.isVegetarian()){ System.out.println(curItem); }
    }
  }
}
