/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Юлия
 */
public interface Subject {
   public void registerObserver (Observer o);
   public void removeObserver (Observer o);
   public void notifyObservers();
   
  
}