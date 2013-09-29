/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosim;

/**
 *
 * @author Alexander
 */
public class Zeebra extends Zoosim {

   public Zeebra(){
       AnimalBehavior = new Animal();
       runBehavior = RunVeryFast();
   
   }
   @Override
    public void display(){
        System.out.println("I'm Zeebra");
    }
}