
package feed;

import java.util.ArrayList;

/**
 * @author Бессонова Татьяна
 */
public class FeedData implements Subject {
    
private ArrayList observers;
private float morning;
private float afternoon;
private float evening;

public FeedData (){
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
        observer.update(morning, afternoon, evening);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(float morning, float afternoon, float evening ){
   this.morning = morning;
   this.afternoon = afternoon;
   this.evening = evening;
   maesurementChanged();
   
}

}

    