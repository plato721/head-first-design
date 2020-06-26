package headFirst.iterator;

public class RestaurantDemo {
  public static void main(String[] args) {
    DinerMenu dinerMenu = new DinerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();

    System.out.println("\n***************************************************************************");
    System.out.println("***    Now the vegetarian items, featuring a lot of duplicate code!     ***");
    System.out.println("***************************************************************************\n\n");

    waitress.printVegetarianMenu();
  }
}
