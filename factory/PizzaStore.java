package headFirst.pizzaFactory;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza = null;
    System.out.println("Your ordered a " + type + " pizza. Good for you!");

    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    System.out.println("One " + pizza.name + " ready to go!");

    return pizza;
  }

  abstract Pizza createPizza(String type);
}
