package headFirst.iterator;
import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();

    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast",
      true, 2.99);

    addItem("Death by pancakes", "Ugh. Another boring menu item name. Should I say that it will literally kill you? Of course not. Because you'd be expecting that, too.",
      false, 13.99);

    addItem("Pancakes and gravy", "It's not really gravy. It's like a sugar tar. That's also not tar. It'll make your heart beat fast and your skin break out, what's not to love?",
      true, 7.49
    );

    addItem("A pancake beyond", "Our beyond beef pancake. The pancake that isn't a pancake or a cow!",
      true, 19.99);
  }

  public void addItem(String name, String description,
                      boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public MenuIterator createIterator() {
    MenuIterator pancakeMenuIterator = new PancakeMenuIterator(menuItems);
    return pancakeMenuIterator;
  }
}
