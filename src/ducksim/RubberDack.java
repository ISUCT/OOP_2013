/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

public class RubberDack extends Duck {
    public RubberDack(){

    flyBehavior = new FlyNoWay();

    squeakBehavior = new Squeak();
}
    @Override
    public void display() {
        System.out.println("Я резиновая уточка");
      
    }
    
    
}
