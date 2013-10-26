
package manger;
/**
 * @author Бессонова Татьяна
 */
import java.util.ArrayList;

public class MangerData implements Subject{
    private ArrayList observers;
    private String fullmanger;
    private String emptymanger;
    
    
    public MangerData (){
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
        observer.update(fullmanger, emptymanger);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(String fullmanger, String emptymanger){
   this.fullmanger = fullmanger;
   this.emptymanger = emptymanger;
   
   maesurementChanged();
   
}
  
}