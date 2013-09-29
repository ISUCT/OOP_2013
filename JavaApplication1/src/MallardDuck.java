/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Дашка1
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
    flyBehavior = new FlyWithWings();

    quackBehavior = new Quack();
    
    }    
    
   
    public void display(){
        System.out.println("I have green head");
    }
    
}