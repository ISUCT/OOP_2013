/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parrots;

/**
 *
 * @author home
 */

 public class Macaw  extends Parrots {
    
    public Macaw() {
        
     flyBehavior = new Fly();
        
     communicateBehavior = new Communicate();

     sizeBehavior = new Size();
    
     topknotBehavior  = new  NoTopknot();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Здравствуйте, Я попугай АРА");
    }
}
    
    
    