

/**
 *
 * @author Максим
 */
public class WeatherStation {
    public static void main(String[] args){
        /* main - метод, с него начинается выполнение программы 
         * метод всегда выдает в результате (возвращает) только одно значение,
         * тип которого обязательно указан передименем метода, но
         * void - ставиться для того что бы метод ничего не возвращял,играл метод процедуры
         * у метода main() только один параметр, его тип- массив,состоящий из строк символов 
         * Строка символов- тип String, а [] - это признак массива 
         * args - имя параметра 
         */
        WeatherData weatherData = new WeatherData();
        //сначала создаем объект WeatherData
    
    CurrentConditionsDisplay сurrentDisplay =
            new CurrentConditionsDisplay (weatherData);
    //StatisticsDisplay statisticsDisplay = new StatisticsDisplay (weatherData);
    //ForecastDisplay forecastDisplay = new ForecastDisplay (weatherData);
    //создаем 3 визуальных элемента, передавая им оъект weatherData
    
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
    //имитация новых погодных данных 
    }

}
