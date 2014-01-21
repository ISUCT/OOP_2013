/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public abstract class Dish {
     String description = "Блюдо"; 
     public String getDescription() { 
     return description; 
     } 
     public abstract double cost(); 
}
