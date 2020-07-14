package headFirst.iterator;

public class DinerMenu {
  public static MenuComponent createMenu() {
    Menu menu = new Menu(
      "Diner",
      "Why is it that the spoon is always greasy?"
    );

    menu.add("Grand Royale", "A large important. A very enormous. Gigantic big big.",
      false, 13.99);

    menu.add("Skinny Phil", "Dry chicken breast, squeeze of lemon, oregano for some reason, distilled water with added asphalt particulate.",
      false, 8.99);

    menu.add("Your Mom", "'You want my mom??'' 'No, Your Mom.'' 'That's what I said!'",
      false, 10.50);

    menu.add("Your Sister", "Really? You have a Your Mom and a Your Sister? Yes. This is not a mature diner.",
      true, 11.99);

    return menu;
  }
}
