package headFirst.templateMethod;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public abstract class CaffeinatedBeverage {
  public String title;

  public final void prepareRecipe() {
    boilWater();
    steep();
    pour();
    if(condimentsNeeded()) {
      addCondiments();
    }
    System.out.println(title + " done!\n");
  }

  private void boilWater() {
    System.out.println("Boiling water");
  }

  abstract void steep();

  private void pour() {
    System.out.println("Pouring your delicious " + title);
  }

  public boolean condimentsNeeded() {
    String answer = getUserInput();

    if(answer.toLowerCase().startsWith("y")){
      return true;
    } else {
      return false;
    }
  }

  public String getUserInput() {
    String answer = null;

    condimentsPrompt();

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO error trying to read your answer");
    }
    if (answer == null) {
      return "nyuuuuope";
    }

    return answer;
  }

  abstract void addCondiments();
  abstract void condimentsPrompt();
}
