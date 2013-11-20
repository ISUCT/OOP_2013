/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Максим
 */
public class StatisticsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public StatisticsDisplay (Subject weatherData ){
        this.weatherData = weatherData;
        weatherData.registerObserver (this);
        /* Конструктору передается объект weatherData,
         * который используется для регистрации элементе
         * в качестве наблюдателя 
         */
    }
    public void update (float temperature,float humidity,float pressure ){
       this.temperature = temperature;
       this.humidity = humidity; 
       display ();
    }
    /* при вызове update() мы сохраняем значение температуры и влажности,
     * после чего выззываем display 
     */
    public void display(){
        System.out.println("Current conditions: " + temperature 
                + " F degress and" + humidity + "%humidity" );
        //метод display() просто вывод текущее значение температуры и влажности
        /*System.out.println означает , что в классе System,
         * определяется переменная с именем out, содержащая экземпляр 
         * клсса PrintStream,
         * в котором есть метод preintln().
         */
    }
    
}
