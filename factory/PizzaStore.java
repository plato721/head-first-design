package headFirst.pizzaFactory;

public class PizzaStore {
  PizzaFactory factory;

  public PizzaStore(PizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = null;
    System.out.println("Your ordered a " + type + " pizza. Good for you!");

    pizza = factory.preparePizza(type);
    pizza.bake();
    pizza.cut();
    pizza.box();

    System.out.println("One " + pizza.name + " ready to go!");

    return pizza;
  }
}