package headFirst.compoundDucks;

public interface QuackObservable {
  public void registerObserver(Observer observer);
  public void notifyObservers();
}
