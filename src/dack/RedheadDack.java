
package dack;

public class RedheadDack extends Dack {
   public RedheadDack(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public void display(){
        System.out.println("Я красноголовая уточка");
    }
}

