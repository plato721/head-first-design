package headFirst.iterator;

public class PancakeHouseMenu {
  public static MenuComponent createMenu() {
    Menu menu = new Menu(
      "Pancake House Menu",
      "Breakfast things"
    );

    menu.add("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast",
      true, 2.99);

    menu.add("Death by pancakes", "Ugh. Another boring menu item name. Should I say that it will literally kill you? Of course not. Because you'd be expecting that, too.",
      false, 13.99);

    menu.add("Pancakes and gravy", "It's not really gravy. It's like a sugar tar. That's also not tar. It'll make your heart beat fast and your skin break out, what's not to love?",
      true, 7.49
    );

    menu.add("A pancake beyond", "Our beyond beef pancake. The pancake that isn't a pancake or a cow!",
      true, 19.99);

    return menu;
  }
}
