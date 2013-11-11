/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public abstract class IceCream {
    String description = "Unknown IceCream"; 
    public String getDescription() { 
    return description; 
    } 
    public abstract double cost(); 

}
