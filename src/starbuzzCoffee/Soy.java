/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzCoffee;

/**
 *
 * @author stud_6
 */
public class Soy extends CondimentDecorator { 
    Beverage beverage; 
    public Soy(Beverage beverage){
    this.beverage = beverage; 
} 
    public String getDescription() {
    return beverage.getDescription() + ",Soy"; 
    }
    public double cost() { 
    return .20 + beverage.cost ();


}}
