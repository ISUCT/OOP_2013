/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class ClimatControl extends Automobile { 
    Automobile automobile; 
    public ClimatControl (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",ClimatControl"; 
    }
    public double cost() { 
    return 170 + automobile.cost ();
    } 
}
