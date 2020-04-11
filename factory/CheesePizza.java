package headFirst.pizzaFactory;

public class CheesePizza extends Pizza {
  public CheesePizza() {
    name = "Cheese Pizza";
    ingredients = new Ingredient[]{
      new Ingredient("dough"),
      new Ingredient("sauce"),
      new Ingredient("cheese")
    };
  }
}
