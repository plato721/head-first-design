package headFirst.pizzaFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new Dough("Thick crust dough");
  }

  public Sauce createSauce() {
    return new Sauce("Plum tomato sauce");
  }

  public Cheese createCheese() {
    return new Cheese("Mozzarella cheese");
  }

  public Veggie[] createVeggies() {
    return new Veggie[]{
      new Veggie("garlic"),
      new Veggie("onion"),
      new Veggie("mushroom"),
      new Veggie("red pepper")
    };
  }

  public Pepperoni createPepperoni() {
    return new Pepperoni("Sliced pepperoni");
  }

  public Clam createclam() {
    return new Clam("Canned clams. But nice.");
  }
}
