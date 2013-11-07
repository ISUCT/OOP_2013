/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class FrameMachine extends Automobile { 
    Automobile automobile; 
    public FrameMachine (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ":FrameMachine"; 
    }
    public double cost() { 
    return 250 + automobile.cost ();
    } 
}
