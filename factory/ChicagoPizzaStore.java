package headFirst.pizzaFactory;

public class ChicagoPizzaStore extends PizzaStore {
  PizzaIngredientFactory ingredientFactory;

  public ChicagoPizzaStore() {
    this.ingredientFactory = new ChicagoPizzaIngredientFactory();
  }

  Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago style cheese pizza");
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("Chicago style pepperoni pizza");
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("Chicago style veggie pizza");
    }

    return pizza;
  }
}
