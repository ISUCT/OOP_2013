/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class Cedar extends CondimentDecorator { 
    IceCream iceCream; 
    public Cedar (IceCream iceCream){
    this.iceCream = iceCream; 
} 
    public String getDescription() {
    return iceCream.getDescription() + ",Cedar"; 
    }
    public double cost() { 
    return 25 + iceCream.cost ();


}}