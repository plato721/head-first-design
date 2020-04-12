package headFirst.pizzaFactory;

public class ChicagoVeggiePizza extends Pizza {
  public ChicagoVeggiePizza() {
    this.name = "Chicago Veggie Pizza";
    this.dough = new Ingredient("Thick crust dough");
    this.sauce = new Ingredient("Plum tomato sauce");

    toppings = new Ingredient[]{
      new Ingredient("Mozzarella cheese"),
      new Ingredient("green pepper"),
      new Ingredient("black olive"),
      new Ingredient("portabello mushroom"),
      new Ingredient("onion")
    };
  }
}
