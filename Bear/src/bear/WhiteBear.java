
package bear;

import observer.bear.Observer;

public class WhiteBear extends Bear implements Observer{
    public WhiteBear() {
    sleepBehavior = new SleepNight();
    eatBehavior = new EatFish();
}

    @Override
    public void display(){
        System.out.println("Я белый медведь)я с Северного полюса");
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
