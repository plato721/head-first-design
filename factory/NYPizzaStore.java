package headFirst.pizzaFactory;

public class NYPizzaStore extends PizzaStore {
  PizzaIngredientFactory ingredientFactory;

  public NYPizzaStore() {
    this.ingredientFactory = new NYPizzaIngredientFactory();
  }

  Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
       pizza = new CheesePizza(ingredientFactory);
       pizza.setName("NY Cheese Pizza");
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("NY PepperoniPizza");
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("NY Veggie Pizza");
    }

    return pizza;
  }
}
