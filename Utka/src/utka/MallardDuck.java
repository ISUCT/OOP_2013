/*
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

/**
 *
 * @author stud_6
 */
public class MallardDuck extends Utka {
    
    
    public MallardDuck() {
    this.flyBehavior = flyBehavior;

    quackBehavior = new Quack();
    
    }   
    
    
    @Override
    public void display(){
        System.out.println("I have green head");
    }


    
}