
package bear;

public class CircusBear extends Bear {
    public CircusBear(){
     
    sleepBehavior = new SleepNight();
    eatBehavior = new EatHoney();
    }

    @Override
    public void display() {
        System.out.println("I'm circus bear!!! ");
    }
   
   
}
