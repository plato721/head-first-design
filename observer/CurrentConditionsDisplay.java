import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Observable observable;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void update(Observable o, Object ignored) {
    if(o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
