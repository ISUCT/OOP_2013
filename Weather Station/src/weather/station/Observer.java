/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.station;

/**
 *
 * @author stud_6
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
