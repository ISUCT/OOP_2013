/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class Pistachio extends CondimentDecorator { 
    IceCream iceCream; 
    public Pistachio (IceCream iceCream){
    this.iceCream = iceCream; 
} 
    public String getDescription() {
    return iceCream.getDescription() + ",Pistachio"; 
    }
    public double cost() { 
    return 30 + iceCream.cost ();


}}
