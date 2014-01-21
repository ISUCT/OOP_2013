package patternobserver;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observeres;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData (){
        observeres = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer o){
    observeres.add(o);
    }
   
    @Override
    public void removeObserver(Observer o){
        int i = observeres.indexOf (o);
        if (i >= 0){
           observeres.remove(i);
        }
    }
    
    @Override
    public void notifyObservers (){
        for (int i = 0; i < observeres.size(); i++){
            Observer observer = (Observer)observeres.get(i);
            observer.update (temperature, humidity, pressure);
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged ();
    }

}
