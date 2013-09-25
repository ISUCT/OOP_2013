/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author Лена
 */
public class RedHeadDuck extends Ducksim {
   public RedHeadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public void display(){
        System.out.println("I am RedHead duck");
    }
}
