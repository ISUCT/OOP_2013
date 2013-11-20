/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public abstract class Beverage {
    
    String description = "Unknown Beverage";
    double cost;
    
    public String getDescription () {
        return description;
    }
    public abstract double cost ();
}
