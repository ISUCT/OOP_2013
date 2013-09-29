/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosim;

/**
 *
 * @author Alexander
 */
public class Giraffe extends Zoosim {
    public Giraffe (){
        runBehavior = new RunSlowly();
        AnimalBehavior= new Animal();
        }
    public void display(){
        System.out.println("I'm Giraffe!");
    }
}
