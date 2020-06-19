package headFirst.duckComparable;
import java.util.Arrays;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = {
      new Duck("Daffy", 3),
      new Duck("Orion", 7),
      new Duck("Twinkie", 2),
      new Duck("Trixie", 14),
      new Duck("Mongo", 1)
    };

    System.out.println("Before sort, ducks look like: ");
    displayDucks(ducks);

    Arrays.sort(ducks);

    System.out.println("\nAfter sort, ducks look like: ");
    displayDucks(ducks);

  }

  public static void displayDucks(Duck[] ducks) {
    for(Duck duck : ducks) {
      System.out.println(duck);
    }
  }
}
