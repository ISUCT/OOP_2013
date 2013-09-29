/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Дашка1
 */
public class RedheadDuck extends Duck {
   public RedheadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
   
    public void display(){
        System.out.println("I have read head");
    }
}