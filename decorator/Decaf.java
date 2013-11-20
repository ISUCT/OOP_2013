/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class Decaf extends Beverage {
    public Decaf (){
      description  = "Decaf";
              }
    @Override
    public double cost (){
        return 1.05;
        
    }
}
