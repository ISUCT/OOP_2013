package observer.bear;


import java.util.Observable;
import java.util.Observer; 
import java.util.ArrayList;

/**
 *
 * @author stud_6
 */
public class WeatherData extends Observable {
    private ArrayList observers;
    private String season;
    
    public WeatherData(){}
   
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

 //   @Override
 //   public void notifyObservers() {
 //       for (int i=0; i<observers.size(); i++){
 //       Observer observer = (Observer)observers.get(i);
 //       observer.update(temperature, humidity, pressure);
 //   }
 // }
  public void seasonChanged() {
      setChanged();
      notifyObservers();
  }  
  public void setSeasons (String season){
      this.season = season;
      seasonChanged();
  }  
  
  public String getSeason(){
      return season;
  }
 
  
}
    
