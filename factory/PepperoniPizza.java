package headFirst.pizzaFactory;

public class PepperoniPizza extends Pizza {
  public PepperoniPizza() {
    name = "Pepperoni Pizza";
    ingredients = new Ingredient[]{
      new Ingredient("dough"),
      new Ingredient("sauce"),
      new Ingredient("cheese"),
      new Ingredient("pepperoni")
    };
  }
}
