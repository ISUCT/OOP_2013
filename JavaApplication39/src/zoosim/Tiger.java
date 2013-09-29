/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosim;

/**
 *
 * @author Alexander
 */
public class Tiger extends Zoosim{
    public Tiger (){
        
    runBehavior = new RunVeryFast();

    AnimalBehavior = new Animal();
    }
    @Override
    public void display() {
      System.out.println("I'm tigerrrr");
   
}
}
