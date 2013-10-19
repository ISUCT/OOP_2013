/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.ArrayList;

/**
 *
 * @author Юлия
 */
public class WeatherStation implements Subject {
    public static void main (String [] args) {
      WeatherStation weatherStation = new WeatherStation();
      CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay (weatherStation);
      weatherStation.setMeasurements(80,65,30.4f);
      weatherStation.setMeasurements(82,79,29.2f);
      weatherStation.setMeasurements(78,90,29.2f);
}    
private ArrayList observers;
private float temperature;
private float humidity;
private float pressure;

public WeatherStation(){
    
    observers = new ArrayList();
}
public void registerObserver (Observer o){
    observers.add (o);
}
public void removeObserver (Observer o){
    int i = observers.indexOf (o);
    if (i>=0){
        observers.remove(i);
      
    }
    
}
public void notifyObservers (){
    for (int i=0; i<observers.size(); i++){
        Observer observer = (Observer)observers.get(i);
        observer.update(temperature, humidity, pressure);
    }
}
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(float temperature, float humidity, float pressure){
   this.temperature = temperature;
   this.humidity = humidity;
   this.pressure = pressure;
   maesurementChanged();
   
}
 //Другие методы WeatherStation   
}
