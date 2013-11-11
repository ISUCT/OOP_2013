/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class Walnut extends CondimentDecorator { 
    IceCream iceCream; 
    public Walnut (IceCream iceCream){
    this.iceCream = iceCream; 
} 
    public String getDescription() {
    return iceCream.getDescription() + ",Walnut"; 
    }
    public double cost() { 
    return 15 + iceCream.cost ();


}}