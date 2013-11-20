/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Subject;

/**
 *
 * @author Stud_6
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    
      private float temperature;
    private float humidity;
    private Subject weatherData;
   public StatisticsDisplay (Subject weatherData){
       this.weatherData = weatherData;
       weatherData.registerObserver (this);
   }
    @Override
   public void update (float temperature, float humidity, float pressure){
       this.temperature = temperature;
        this.humidity = humidity;
        display ();
   }
    @Override
    public void  display (){
        System.out.println ("Current conditions "+ temperature + "F degrees and" + humidity + "% humidity");
    }
}
