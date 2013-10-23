/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observers.bird;
import java.util.Observable;
import java.util.Observer; 
/**
 *
 * @author stud_6
 */
public class FullnessData extends Observable {
    private boolean fullness;
    private String weather;
    
    
    public FullnessData(){}
  
  public void measurementsChanged() {
      setChanged();
      notifyObservers();
  }  
  public void setMeasurements (boolean fullness){
      this.fullness = fullness;
      this.weather = weather;
      measurementsChanged();
  }  
  
  public boolean getFullness(){
      return fullness;
  }
  public String getWeather(){
      return weather;
  }
    
}
    
