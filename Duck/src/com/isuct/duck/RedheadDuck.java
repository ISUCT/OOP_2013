package com.isuct.duck;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_6
 */
public class RedheadDuck extends Duck{
    
    public RedheadDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
    
}
    @Override
      public void display(){
         System.out.println("I have red head!");
    }


    
}