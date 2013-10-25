/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public class ForecastDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject wetherData;
    private float fTemperature;
    private float fHumidity;
    private float fPressure;
    
    public ForecastDisplay(ISubject wetherData) {
        this.wetherData = wetherData;
        wetherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
    
    public void forecast (float temperature, float humidity, float pressure) {
        float fTemperature = temperature+1;
        float fHumidity = humidity+1;
        float fPressure = pressure+1;
        display();
    }

    public void display() {
        System.out.println("Прогноз \r\n" + "Температура " + fTemperature + " градусов по Фаренгейту, \r\n" + 
                "Влажность " + fHumidity + "% влажности \r\n" + "Давление " + fPressure + "мм ртутного столба");
    }
}