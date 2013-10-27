/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;


public class Labrador extends Dog {
    public Labrador(){
     
    sleepBehavior = new NightSleep();
    playBehavior = new PlayWithBall();
    }

    @Override
    public void display() {
        System.out.println("...I'm Labrador dog!... ");
    }
   
   
}

