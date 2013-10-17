/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Stud_6
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    //    private Subject weatherData;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable observable){
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }
    
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humadity = humadity;
//        display();
//    }
    public void update(Observable obs, Object args){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Текущие условия: " + temperature + "F градусов и " + humidity + "% влажности");
    }
    
}
