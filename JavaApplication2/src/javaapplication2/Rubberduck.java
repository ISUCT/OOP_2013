/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author stud_6
 */
public class Rubberduck extends Duck {
       public Rubberduck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }

    @Override
    public void display(){
        System.out.println("Я красная голова");
    }
}
    
