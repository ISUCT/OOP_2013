/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Starbuzz;

/**
 *
 * @author Admin
 */
public class Mocha extends CondimentDecorator { 
    Beverage beverage; 
    public Mocha(Beverage beverage){
    this.beverage = beverage; 
} 
    public String getDescription() {
    return beverage.getDescription() + ",Mocha"; 
    }
    public double cost() { 
    return .20 + beverage.cost ();


}}