package headFirst.iterator;

public class RestaurantDemo {
  public static void main(String[] args) {
    MenuItem menuItem = new MenuItem("Oatmeal",
      "What do you think it is?",
      true,
      1.99);

    System.out.println(menuItem);

    DinerMenu dinerMenu = new DinerMenu();
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}
