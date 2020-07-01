package headFirst.iterator;

public class DinerMenu {
  static final int MAX_MENU_ITEMS = 6;
  int menuItemsCount = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_MENU_ITEMS];

    addItem("Grand Royale", "A large important. A very enormous. Gigantic big big.",
      false, 13.99);

    addItem("Skinny Phil", "Dry chicken breast, squeeze of lemon, oregano for some reason, distilled water with added asphalt particulate.",
      false, 8.99);

    addItem("Your Mom", "'You want my mom??'' 'No, Your Mom.'' 'That's what I said!'",
      false, 10.50);

    addItem("Your Sister", "Really? You have a Your Mom and a Your Sister? Yes. This is not a mature diner.",
      true, 11.99);
  }

  public void addItem(String name, String description,
                      boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems[menuItemsCount] = menuItem;
    menuItemsCount = menuItemsCount + 1;
  }

  public MenuIterator createIterator() {
    MenuIterator menuIterator = new DinerMenuIterator(menuItems);
    return menuIterator;
  }
}
