package WeatherStation;

/**
 *
 * @author Admin
 */
public interface Observer {
  public void update (float temp, float humidity, float pressure);

}