/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author alyona
 */
public class RedHeadDuck extends Duck {
   public RedHeadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public void display(){
        System.out.println("My head is red");
    }

  
}

