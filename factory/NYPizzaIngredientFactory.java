package headFirst.pizzaFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new Dough("Thin crust dough");
  }

  public Sauce createSauce() {
    return new Sauce("Marinara sauce");
  }

  public Cheese createCheese() {
    return new Cheese("Reggiano cheese");
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
    return new Clam("Fresh clams");
  }
}