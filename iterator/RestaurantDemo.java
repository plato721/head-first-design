package headFirst.iterator;

public class RestaurantDemo {
  public static void main(String[] args) {
    MenuComponent allMenus = new Menu(
      "Unified Menu",
      "Welcome to the restaurant"
    );
    MenuComponent dinerMenu = DinerMenu.createMenu();
    MenuComponent pancakeHouseMenu = PancakeHouseMenu.createMenu();
    MenuComponent steakHouseMenu = SteakHouseMenu.createMenu();

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(steakHouseMenu);

    Waitress waitress = new Waitress(allMenus);
    waitress.print();

//     System.out.println("\n***************************************************************************");
//     System.out.println("***    Now the vegetarian items, featuring a lot of duplicate code!     ***");
//     System.out.println("***************************************************************************\n\n");
//
//     waitress.printVegetarianMenu();
  }
}
