/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private ISubject wetherData;

    public CurrentConditionsDisplay(ISubject wetherData) {
        this.wetherData = wetherData;
        wetherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Текущее положение: " + temperature + " градусов по Фаренгейту, " + humidity + "% влажности");
    }
}