
package bear;

import observer.bear.Observer;

public class BrownBear extends Bear implements Observer {
    
    public BrownBear() {
    sleepBehavior = new SleepWinter();
    eatBehavior = new EatHoney();
    }

    @Override
    public void display() {
        System.out.println("Я русский бурый медведь!!!");
    }
 @Override
    public void updaTe(String season) {
        if (season.equals(Constants.SPRING)) {
          this.wake();  
        }else{
           sleepBehavior.Sleep(); 
        }
    }

}
