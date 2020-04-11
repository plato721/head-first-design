package headFirst.pizzaFactory;

abstract class Pizza {
  Ingredient[] ingredients;
  String name;

  void prepare() {
    System.out.println("Preparing the pizza...");
    for(Ingredient ingredient : ingredients) {
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
