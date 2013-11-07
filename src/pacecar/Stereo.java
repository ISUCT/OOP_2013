/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class Stereo extends Automobile { 
    Automobile automobile; 
    public Stereo (Automobile automobile){
    this.automobile = automobile; 
} 
    public String getDescription() {
    return automobile.getDescription() + ",Stereo"; 
    }
    public double cost() { 
    return 220 + automobile.cost ();


}}
