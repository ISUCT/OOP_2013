/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class Raspberry extends CondimentDecorator { 
    IceCream iceCream; 
    public Raspberry (IceCream iceCream){
    this.iceCream = iceCream; 
} 
    public String getDescription() {
    return iceCream.getDescription() + ",Raspberry"; 
    }
    public double cost() { 
    return 20 + iceCream.cost ();


}}