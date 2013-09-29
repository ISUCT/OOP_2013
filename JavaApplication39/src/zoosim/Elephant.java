/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosim;

/**
 *
 * @author Alexander
 */
public class Elephant extends Zoosim {

   public Elephant(){
       runBehavior = new RunSlowly();
       AnimalBehavior = new Animal();
   }
    @Override
    public void display(){
        System.out.println("I'm Elephant!");
    }
}