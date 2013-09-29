
package dack;


public class MallardDack extends Dack {
    
    public MallardDack() {
    flyBehavior = new FlyWithWings();

    quackBehavior = new Quack();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Я утка маллордовая");
    }
    
}
