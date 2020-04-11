package headFirst.pizzaFactory;

public class PizzaDemo {
  public static void main(String[] args) {
    PizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);

    Pizza pizza = store.orderPizza("cheese");
    Pizza pizza2 = store.orderPizza("pepperoni");

    return;
  }
}
