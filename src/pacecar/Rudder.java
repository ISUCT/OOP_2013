/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class Rudder extends Automobile { 
    Automobile automobile; 
    public Rudder (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",Rudder"; 
    }
    public double cost() { 
    return 70 + automobile.cost ();
    } 
}
