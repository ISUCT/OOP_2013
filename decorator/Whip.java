/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class Whip extends Beverage {
    public Whip (){
      description  = "Whip";
              }

    Whip(Beverage beverage2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public double cost (){
        return .10;
        
    }
    
}
