/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class Strawberry extends CondimentDecorator { 
    IceCream iceCream; 
    public Strawberry (IceCream iceCream){
    this.iceCream = iceCream; 
} 
    public String getDescription() {
    return iceCream.getDescription() + ",Strawberry"; 
    }
    public double cost() { 
    return 27 + iceCream.cost ();


}}
