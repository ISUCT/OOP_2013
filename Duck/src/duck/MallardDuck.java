/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Stud_6
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
    flyBehavior = new FlyWithWings();

    quackBehavior = new Quack();
    
    }    
    
    @Override
    public void display(){
        System.out.println("I have green head");
    }

   
    
}
