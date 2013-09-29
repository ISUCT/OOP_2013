
package javaapplication2;

public class RedheadDuck extends Duck {
   public RedheadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public String display(){
        System.out.println("I have read head");
        return "I have read head";
    }
}

