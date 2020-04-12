package headFirst.pizzaFactory;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoCheesePizza();
    } else if (type.equals("veggie")) {
      return new ChicagoVeggiePizza();
    }

    return null;
  }
}
