
package bear;


public abstract class Bear {

    
       SleepBehavior sleepBehavior;
       EatBehavior eatBehavior;
    public void performSleep(){
        sleepBehavior.Sleep();
    }
    
    public void performEat(){
        eatBehavior.Eat();
    }
    
    public static void main(String[] args){
        BrownBear bear1 = new BrownBear();
        bear1.display();
        bear1.eat();
        bear1.sleep();
        bear1.setsleepBehavior(new SleepWinter());
        bear1.performEat();
        bear1.performSleep();
       
       
        CircusBear bear2 = new CircusBear();
        bear2.display();
        bear2.eat();
        bear2.sleep(); 
        bear2.performEat();
        bear2.performSleep();
        
        WhiteBear bear3 = new WhiteBear();
        bear3.display();
        bear3.eat();
        bear3.sleep(); 
        bear3.performEat();
        bear3.performSleep();
        
    }
    
    public void sleep() {
        System.out.println("I'm sleeping now");
}
    public void eat(){
        System.out.println("I'm eating now");
    }
    public abstract void display();
        public void  setsleepBehavior(SleepBehavior sb){
            sleepBehavior = sb;
        }
        public void setEatBehavior(EatBehavior tb){
            eatBehavior = tb;
        }
}
    