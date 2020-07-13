package headFirst.iterator;

public class DessertMenu {
  public static MenuComponent createMenu() {
    Menu menu = new Menu(
      "Dessert",
      "If you want to poision yourself with this, we'll accept payment for it."
    );

    menu.add(
      "Cake",
      "You've seen cake, right?",
      false,
      5.99
    );

    menu.add(
      "Apple Pie",
      "Third base? Gross.",
      false,
      4.99
    );

    menu.add(
      "Cheesecake",
      "If you want something a bit sour, to allow you to ingest more sugar.",
      true,
      5.49
    );

    return menu;
  }
}
