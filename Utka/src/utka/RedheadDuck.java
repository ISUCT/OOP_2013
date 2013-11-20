/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

/**
 *
 * @author stud_6
 */
public class RedheadDuck extends Utka {

   public RedheadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    /**
     *
     */
    @Override
    public void display(){
        System.out.println("I have read head");
    }
}
