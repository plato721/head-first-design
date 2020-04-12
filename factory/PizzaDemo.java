package headFirst.pizzaFactory;

import java.util.ArrayList;


public class PizzaDemo {
  public static void main(String[] args) {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    PizzaStore nyPizzaStore = new NYPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    // ny pizzas
    pizzas.add(nyPizzaStore.orderPizza("cheese"));
    printSpacer();
    pizzas.add(nyPizzaStore.orderPizza("pepperoni"));
    printSpacer();
    pizzas.add(nyPizzaStore.orderPizza("veggie"));
    printSpacer();

    // chicago pizzas
    pizzas.add(chicagoPizzaStore.orderPizza("cheese"));
    printSpacer();
    pizzas.add(chicagoPizzaStore.orderPizza("pepperoni"));
    printSpacer();
    pizzas.add(chicagoPizzaStore.orderPizza("veggie"));
    printSpacer();

    System.out.println("The pizzas ordered are: ");
    for(Pizza pizza : pizzas){
      System.out.println(" - " + pizza.name);
    }

    return;
  }

  public static void printSpacer() {
    System.out.println("");
  }
}
