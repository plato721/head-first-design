package headFirst.pizzaFactory;

public class NYPepperoniPizza extends Pizza {
  public NYPepperoniPizza() {
    this.name = "NY Pepperoni Pizza";
    this.dough = new Ingredient("Thin crust dough");
    this.sauce = new Ingredient("Marinara sauce");

    toppings = new Ingredient[]{
      new Ingredient("Grated Reggiano cheese"),
      new Ingredient("Sliced pepperoni")
    };
  }
}
