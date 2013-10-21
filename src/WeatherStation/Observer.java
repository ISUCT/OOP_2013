/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

/**
 *
 * @author Admin
 */
public interface Observer {
  public void update (float temp, float humidity, float pressure);

}