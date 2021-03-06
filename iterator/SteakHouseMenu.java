package headFirst.iterator;

public class SteakHouseMenu {
  public static MenuComponent createMenu() {
    Menu menu = new Menu(
      "Steakhouse",
      "First come, first steaked"
    );

    menu.add(
      "Porterhouse",
      "It's a house large enough to warrant having a porter on staff.",
      false,
      55
    );

    menu.add(
      "Beyond Porterhouse",
      "If you're a vegetarian, would you really order this? Or just get some baby corns from the salad bar?",
      true,
      75
    );

    menu.add(
      "T-Bone",
      "A boneless, skinless, cutlet... What do you think it is? It's a steak. With a bone in it. That resembles a T.",
      false,
      40
    );

    return menu;
  }
}
