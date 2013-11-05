/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svetofor;

import java.util.ArrayList;

/**
 *
 * @author Юлия
 */
public class SvetoforData implements Subject {
private ArrayList observers;
private float green;
private float yellow;
private float red;

public SvetoforData (){
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
        observer.update(green, yellow, red);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(float green, float yellow, float red ){
   this.green = green;
   this.yellow = yellow;
   this.red = red;
   maesurementChanged();
   
}
 //Другие методы WeatherStation   
}
