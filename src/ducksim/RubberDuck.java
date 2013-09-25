/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author Лена
 */
public class RubberDuck extends Ducksim {
    public RubberDuck(){

    flyBehavior = new FlyNoWay();

    quackBehavior = new Quack();
}
    @Override
    public void display() {
        System.out.println("I am rubber duck");
      
    }
    
    
}