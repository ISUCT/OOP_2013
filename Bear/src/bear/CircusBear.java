
package bear;

import observer.bear.Observer;

public class CircusBear extends Bear implements Observer {
    public CircusBear(){
     
    sleepBehavior = new SleepNight();
    eatBehavior = new EatHoney();
    }

    @Override
    public void display() {
        System.out.println("Привет!я цирковой медведь!!! ");
    }
    @Override
    public void updaTe(String season) {
        if (season.equals(Constants.SPRING)) {
          this.performSleep();  
        }else{
           sleepBehavior.Sleep(); 
        }
    }
   
}
