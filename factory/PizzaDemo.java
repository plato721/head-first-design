package headFirst.pizzaFactory;

public class PizzaDemo {
  public static void main(String[] args) {
    PizzaFactory factory = new SimplePizzaFactory();

    // Ordering a cheese pizza
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.orderPizza("cheese");

    // Ordering a pepperoni pizza
    Pizza pizza2 = store.orderPizza("pepperoni");

    return;
  }
}
