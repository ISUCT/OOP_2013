/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class Motor extends Automobile { 
    Automobile automobile; 
    public Motor (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",Motor"; 
    }
    public double cost() { 
    return 180 + automobile.cost ();
    } 
}
