package headFirst.templateMethod;

public class Coffee extends CaffeinatedBeverage {
  public Coffee() {
    this.title = "Coffee";
  }

  public void steep() {
    System.out.println("Dripping coffee through filter");
  }

  public void addCondiments() {
    System.out.println("Adding milk AND sugar. It's the dunkin way.");
  }

  public void condimentsPrompt() {
    System.out.println("Would you like milk and sugar?");
  }
}
