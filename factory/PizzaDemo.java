package headFirst.pizzaFactory;

public class PizzaDemo {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();

    // ny cheese pizza
    Pizza nyCheese = nyPizzaStore.orderPizza("cheese");
    Pizza nyPepperoni = nyPizzaStore.orderPizza("pepperoni");

    // chicago veggies pizza

    return;
  }
}
