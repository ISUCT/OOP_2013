/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javaapplication4.Birds;

/**
 *
 * @author ксюша
 */
public abstract class BirdsDecorator extends Birds {
    
    @Override
    public abstract String getDescription(); 
    
@Override
    public abstract String display(); 
    
}
