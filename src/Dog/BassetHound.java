/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;


/**
 *
 * @author Alyona
 */
public class BassetHound extends Dog {
    public BassetHound(){
     
    sleepBehavior = new DaytimeSleep();
    playBehavior = new PlayWithBall();
    }

    @Override
    public void display() {
        System.out.println("...I'm Basset Hound dog!... ");
    }
   
   
}
