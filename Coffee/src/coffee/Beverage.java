/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author Stud_6
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
