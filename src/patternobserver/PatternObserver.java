package patternobserver;

public class PatternObserver {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20,65,30.4f);
        weatherData.setMeasurements(18,70,29.2f);
        weatherData.setMeasurements(25,90,29.2f);
    
    }
}
