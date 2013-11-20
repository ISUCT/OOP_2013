/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description  = "House Blend Coffee";
        
    }
    @Override
    public double cost (){
        return .89;
    }
}
