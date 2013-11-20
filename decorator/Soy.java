/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class Soy extends Beverage{
     public Soy (){
      description  = "Soy";
              }

    Soy(Beverage beverage3) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public double cost (){
        return .15;
        
    }
}
