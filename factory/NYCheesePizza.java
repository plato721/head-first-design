package headFirst.pizzaFactory;

public class NYCheesePizza extends Pizza {
  public NYCheesePizza() {
    this.name = "NY Cheese Pizza";
    this.dough = new Ingredient("Thin crust dough");
    this.sauce = new Ingredient("Marinara sauce");

    toppings = new Ingredient[]{
      new Ingredient("Grated Reggiano cheese"),
    };
  }
}
