package headFirst.singleton;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    Singleton singleton3 = Singleton.getInstance();

    Boolean truthy = (singleton2 == singleton && singleton == singleton3);

    if(truthy){
      System.out.println("They are all equal! Hooray!");
    } else {
      System.out.println("Something went horribly wrong.");
    }
  }
}
