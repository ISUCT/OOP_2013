/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndecorator;

/**
 *
 * @author SAMSUNG
 */
public abstract class Beverage {
     String description = "Unknown Beverage"; 
     public String getDescription() { 
     return description; 
     } 
     public abstract double cost(); 
}
