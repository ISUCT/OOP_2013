/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe;

/**
 *
 * @author Stud_6
 */
public class NotTypicalGiraffe extends Giraffe{
    public NotTypicalGiraffe(){
    runBehavior = new Run();
    mood = new AngryGiraffe();
   }

   
    @Override
    public void display() {
        System.out.println("Hi! I'm not typical giraffe!");
    }

   
}
