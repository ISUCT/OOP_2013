/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class Wheel extends Automobile { 
    Automobile automobile; 
    public Wheel (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",Wheel"; 
    }
    public double cost() { 
    return 200 + automobile.cost ();
    } 
}

  