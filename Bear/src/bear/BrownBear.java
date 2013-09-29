
package bear;

public class BrownBear extends Bear {
    
    public BrownBear() {
    sleepBehavior = new SleepWinter();
    eatBehavior = new EatHoney();
    }

    @Override
    public void display() {
        System.out.println("I'm Russian brown bear!!!");
    }
}
