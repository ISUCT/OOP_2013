/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dack;

/**
 *
 * @author stud_6
 */
public class RubberDack extends Dack {
    public RubberDack(){

    flyBehavior = new FlyNoWay();

    squeakBehavior = new Squeak();
}
    @Override
    public void display() {
        System.out.println("Я резиновая уточка");
      
    }
    
    
}
