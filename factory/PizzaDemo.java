package headFirst.pizzaFactory;

import java.util.ArrayList;


public class PizzaDemo {
  public static void main(String[] args) {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    // ny cheese pizza
    pizzas.add(nyPizzaStore.orderPizza("cheese"));
    pizzas.add(nyPizzaStore.orderPizza("pepperoni"));

    // chicago veggies pizza
    pizzas.add(chicagoPizzaStore.orderPizza("veggie"));
    pizzas.add(chicagoPizzaStore.orderPizza("veggie"));

    System.out.println("\n\n" + "The pizzas ordered are: ");
    for(Pizza pizza : pizzas){
      System.out.println(" - " + pizza.name);
    }

    return;
  }
}
