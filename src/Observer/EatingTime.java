/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.ArrayList;
/**
 *
 * @author Alyona
 */
public class EatingTime implements Subject{
    private ArrayList observers;
    private String breakfast;
    private String dinner;
    private String supper;
    
    
    public EatingTime (){
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
        observer.update(breakfast, dinner, supper);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(String breakfast, String dinner, String supper ){
   this.breakfast = breakfast;
   this.dinner = dinner;
   this.supper = supper;
  
   maesurementChanged();
   
}

}
