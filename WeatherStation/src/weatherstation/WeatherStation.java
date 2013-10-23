/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Stud_6
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 80, 25.4f);
        weatherData.setMeasurements(90, 75, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        
    }
}