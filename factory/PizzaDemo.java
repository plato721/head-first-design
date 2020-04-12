package headFirst.pizzaFactory;

public class PizzaDemo {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    // ny cheese pizza
    Pizza nyCheese = nyPizzaStore.orderPizza("cheese");
    Pizza nyPepperoni = nyPizzaStore.orderPizza("pepperoni");

    // chicago veggies pizza
    Pizza chiCheese = chicagoPizzaStore.orderPizza("veggie");
    Pizza chiVeggie = chicagoPizzaStore.orderPizza("veggie");

    return;
  }
}
