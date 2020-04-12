package headFirst.pizzaFactory;

public abstract class Pizza {
  String name;

  Dough dough;
  Cheese cheese;
  Sauce sauce;
  Veggie[] veggies;
  Pepperoni pepperoni;
  Clam clams;

  // PizzaIngredientFactory ingredientFactory;
  // ^ ^ all of the pizzas make use of an ingrdient factory, so the field could
  // be included here.. But should they have to be required to use a
  // pizza ingrdient factory? *shrugs*

  abstract void prepare();

  void bake(){
    System.out.println("Baking the pizza (regular pizza store time and temp)!");
  }

  // Interesting that the factory method demo overrode this for chicago pizzas,
  // but now we're stuck with this method of cutting for all pizzas, because
  // we've chosen to allow variation on ingredient types only.
  // Does pizza need a cutting strategy?
  void cut(){
    System.out.println("Cutting the pizza into wedges!");
  }

  void box(){
    System.out.println("Boxing the pizza (in official box)!");
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return this.name;
  }
}
