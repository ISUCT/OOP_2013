
package bear;

public class WhiteBear extends Bear {
    public WhiteBear() {
    sleepBehavior = new SleepNight();
    eatBehavior = new EatFish();
}

    @Override
    public void display(){
        System.out.println("I'm white bear! I'm from North");
    }

    
}
