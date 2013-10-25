/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public interface ISubject {
    public void registerObserver (IObserver observer);
    public void removeObserver (IObserver observer);
    public void notifyObserver ();
}
