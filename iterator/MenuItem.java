package headFirst.iterator;

public class MenuItem {
  String name;
  String description;
  boolean vegetarian;
  double price;

  public MenuItem(String name,
                  String description,
                  boolean vegetarian,
                  double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String toString() {
    return name + " $" + Double.toString(price) +
      "\n-----------------\n" +
      description + "\n";
  }
}
