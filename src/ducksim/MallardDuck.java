/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

public class MallardDuck extends Duck {
    
    public MallardDuck() {
    flyBehavior = new FlyWithWings();

    quackBehavior = new Quack();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Я утка маллордовая");
    }
    
}
