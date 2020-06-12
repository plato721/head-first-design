package headFirst.templateMethod;

public abstract class CaffeinatedBeverage {
  public String title;

  public final void prepareRecipe() {
    boilWater();
    steep();
    pour();
    if(condimentsNeeded()) {
      addCondiments();
    }
  }

  private void boilWater() {
    System.out.println("Boiling water");
  }

  abstract void steep();

  private void pour() {
    System.out.println("Pouring your delicious " + title);
  }

  private boolean condimentsNeeded() {
    return true;
  }

  abstract void addCondiments();
}
