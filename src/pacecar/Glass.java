/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class Glass extends Automobile { 
    Automobile automobile; 
    public Glass (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",Glass"; 
    }
    public double cost() { 
    return 120 + automobile.cost ();
    } 
}
