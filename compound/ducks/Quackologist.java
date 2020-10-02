package headFirst.compoundDucks;

public class Quackologist implements Observer {
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck + " has done the quack.");
  }
}
