package headFirst.pizzaFactory;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new NYCheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NYPepperoniPizza();
    } //else if (type.equals("clam")) {
    //   pizza = new ClamPizza();
    // } else if (type.equals("veggie")) {
    //   pizza = new VeggiePizza();
    // }
    return pizza;
  }
}