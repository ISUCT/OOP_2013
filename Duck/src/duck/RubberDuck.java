/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Stud_6
 */
public class RubberDuck extends Duck {
   public RubberDuck(){
       flyBehavior = new FlyNoWay();
       quackBehavior = new Squeack();
   }
    @Override
    public void display(){
        System.out.println("I'm Rubber Duck!!!");
    }

  
}
 
    

