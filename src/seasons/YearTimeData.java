/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class YearTimeData implements Subject{
    private ArrayList observers;
    private String winter;
    private String spring;
    private String summer;
    private String autumn;
    
    public YearTimeData (){
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
        observer.update(winter, spring, summer,autumn);
    }
    }
public void maesurementChanged(){
    notifyObservers();
    
}
public void setMeasurements(String winter, String spring, String summer, String autumn ){
   this.winter = winter;
   this.spring = spring;
   this.summer = summer;
   this.autumn = autumn;
   maesurementChanged();
   
}

}