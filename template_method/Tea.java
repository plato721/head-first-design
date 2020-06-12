package headFirst.templateMethod;

public class Tea extends CaffeinatedBeverage {
  public Tea() {
    this.title = "tea";
  }

  public void steep() {
    System.out.println("Dripping tea through filter");
  }

  public void addCondiments() {
    System.out.println("Adding lemon. Because reasons.");
  }
}
