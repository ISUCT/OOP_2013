/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Starbuzz;

/**
 *
 * @author Admin
 */
public class Whip extends CondimentDecorator { 
    Beverage beverage; 
    public Whip(Beverage beverage){
    this.beverage = beverage; 
} 
    public String getDescription() {
    return beverage.getDescription() + ",Whip"; 
    }
    public double cost() { 
    return .20 + beverage.cost ();


}}

