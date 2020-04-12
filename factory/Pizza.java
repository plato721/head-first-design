package headFirst.pizzaFactory;

abstract class Pizza {
  String name;
  Ingredient dough;
  Ingredient sauce;
  Ingredient[] toppings;

  void prepare() {
    System.out.println("Preparing the pizza...");

    System.out.println("...tossing the " + dough);
    System.out.println("...ladeling the " + sauce);

    for(Ingredient ingredient : toppings) {
      System.out.println("...adding " + ingredient);
    }
  }

  void bake(){
    System.out.println("Baking the pizza!");
  }

  void cut(){
    System.out.println("Cutting the pizza!");
  }

  void box(){
    System.out.println("Boxing the pizza!");
  }
}
