package patternobserver;

public class StatisticsDisplay implements Observer,DisplayElement  {
    private float temperature;
    private float humidity;
 
  @Override
  public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();       
    } 
  
    @Override
    public void display (){
        System.out.println("Вывод статистики"); 
    }

}