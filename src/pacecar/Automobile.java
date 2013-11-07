/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public abstract class Automobile {
    String description = "Unknown Automobile"; 
    public String getDescription() { 
    return description; 
    } 
    public abstract double cost(); 

}
