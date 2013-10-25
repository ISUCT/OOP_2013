/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public interface IObserver {
    public void update (float temp, float humidity, float pressure);
}
