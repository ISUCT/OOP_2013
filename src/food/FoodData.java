/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class FoodData implements Subject {
private ArrayList observers;
private float breakfast;
private float lunch;
private float dinner;

public FoodData (){
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
        observer.update(breakfast, lunch, dinner);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(float breakfast, float lunch, float dinner ){
   this.breakfast = breakfast;
   this.lunch = lunch;
   this.dinner = dinner;
   maesurementChanged();
   
}
 //Другие методы WeatherStation   
}

    
