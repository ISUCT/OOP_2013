/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author Лена
 */
public class MallardDuck extends Ducksim{
    public MallardDuck() {
    flyBehavior = new FlyWithWings();

    quackBehavior = new Quack();
    
    }    

    @Override
    public void display() {
      System.out.println("I am Mallard duck");
    }

   
}