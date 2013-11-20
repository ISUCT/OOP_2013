/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

import utka.FlyNoWay;
import utka.Squeack;
import utka.Utka;

/**
 *
 * @author Stud_6
 */
public class RubberDuck extends Utka {
   public RubberDuck(){
       flyBehavior = new FlyNoWay();
       quackBehavior = new Squeack();
   }
    /**
     *
     */
    @Override
    public void display(){
        System.out.println("I'm Rubber Duck!!!");
    }

  
}
 