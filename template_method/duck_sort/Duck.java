package headFirst.duckComparable;

public class Duck implements Comparable {
  String name;
  Integer weight;

  public Duck (String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String toString() {
    return name + " weighs " + weight;
  }

  public int compareTo(Object object) {
    Duck otherDuck = (Duck)object;

    if (this.weight < otherDuck.weight) {
      return -1;
    } else if (this.weight > otherDuck.weight) {
      return 1;
    } else {
      return 0;
    }
  }
}
