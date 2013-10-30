/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ксюша
 */
public abstract class Beverage {
    String description = "Unknown beverage";
    public String getDescription (){
        return description;
    }
    public abstract double cost();
}

