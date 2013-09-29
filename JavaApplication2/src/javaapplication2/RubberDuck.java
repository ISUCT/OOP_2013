/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author stud_6
 */
public class RubberDuck extends Duck {
    
    public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeack();
    
    }    


    @Override
    public String display() {
        System.out.println("I'm little yellow duck");
        return "I'm little yellow duck";
    }
    
}
