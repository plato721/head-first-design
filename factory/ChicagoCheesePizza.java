package headFirst.pizzaFactory;

public class ChicagoCheesePizza extends Pizza {
  public ChicagoCheesePizza() {
    this.name = "Chicago Cheese Pizza";
    this.dough = new Ingredient("Thick crust dough");
    this.sauce = new Ingredient("Plum tomato sauce");

    toppings = new Ingredient[]{
      new Ingredient("Mozzarella cheese"),
    };
  }
}
