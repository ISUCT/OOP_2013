
package bear;

import java.util.Observable;
import observer.bear.Observer;
import observer.bear.WeatherData;


public abstract class Bear implements Observer {

        
       SleepBehavior sleepBehavior;
       EatBehavior eatBehavior;
    private String season;
    public void performSleep(){
        sleepBehavior.Sleep();
    }
    
    public void performEat(){
        eatBehavior.Eat();
    }
    
//    @Override
//    public void update(String season) {
//        if (season.equals(Constants.SPRING)) {
//          this.wake();  
//        }else{
//           sleepBehavior.Sleep(); 
//        }
//    }
     
    public static void main(String[] args){
        BrownBear bear1 = new BrownBear();
        bear1.display();
        bear1.eat();
        bear1.sleep();
        bear1.setsleepBehavior(new SleepWinter());
        bear1.performEat();
        bear1.performSleep();
        bear1.updaTe(Constants.SPRING);
       
       
        CircusBear bear2 = new CircusBear();
        bear2.display();
        bear2.eat();
        bear2.sleep(); 
        bear2.performEat();
        bear2.performSleep();
        bear2.updaTe(Constants.WINTER);
        
        WhiteBear bear3 = new WhiteBear();
        bear3.display();
        bear3.eat();
        bear3.sleep(); 
        bear3.performEat();
        bear3.performSleep();
        bear3.updaTe(Constants.SPRING);
    }
    
    public void sleep() {
        System.out.println("Я сейчас сплю");
}
    public void wake(){
      System.out.println("я проснлулся!!");  
    }
    public void eat(){
        System.out.println("Я сейчас кушаю");
    }
    public abstract void display();
        public void  setsleepBehavior(SleepBehavior sb){
            sleepBehavior = sb;
        }
        public void setEatBehavior(EatBehavior tb){
            eatBehavior = tb;
        }
        public void updaTe(Observable obs, Object arg) {
        if (obs instanceof WeatherData){ 
           WeatherData weatherData = (WeatherData) obs;
           this.season = weatherData.getSeason();
           
           display();
        }
    }
}
    