package headFirst.singleton;

public class Singleton {
  private volatile static Singleton theOneThing = null;

  private Singleton(){}

  public static Singleton getInstance(){
    if (theOneThing == null) {
      synchronized (Singleton.class) {
        if (theOneThing == null) {
          theOneThing = new Singleton();
        }
      }
    }
    return theOneThing;
  }
}
