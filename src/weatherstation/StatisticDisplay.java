/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public class StatisticDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject wetherData;

    public StatisticDisplay(ISubject wetherData) {
        this.wetherData = wetherData;
        wetherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
//        System.out.println("Статистика");
        System.out.println ("Температура " + temperature + " градусов по Фаренгейту, \r\n" + 
                "Влажность " + humidity + "% влажности \r\n" + "Давление " + pressure + "мм ртутного столба");
    }
}