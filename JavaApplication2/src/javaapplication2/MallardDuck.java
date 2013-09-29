
package javaapplication2;


public class MallardDuck extends Duck {
    
    public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
    
    }    
    
    @Override
    public String display(){
        System.out.println("I have green head");
        return "I have green head";
        
    }


}
