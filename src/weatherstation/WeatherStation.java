/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.ArrayList;

/**
 *
 * @author stud_6
 */
public class WeatherStation implements ISubject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherStation () {
        observers = new ArrayList ();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherStation weatherData = new WeatherStation ();
        
        CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay (weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay (weatherData);
        StatisticDisplay statisticDisplay= new StatisticDisplay (weatherData);
        
        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++ ) {
            IObserver observer = (IObserver)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged (){
        notifyObserver();
    }
    
    public void setMeasurement (float temperature, float humidity, float pressure ) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged ();
    }
}
