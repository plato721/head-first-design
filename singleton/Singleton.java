package headFirst.singleton;

public class Singleton {
  private static Singleton theOneThing = null;
  private Singleton(){}

  public static synchronized Singleton getInstance(){
    if (theOneThing == null) {
      theOneThing = new Singleton();
    }
    return theOneThing;
  }
}
