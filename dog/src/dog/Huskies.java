/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;


public class Huskies extends Dog {
    public Huskies(){
     
    sleepBehavior = new NightSleep();
    playBehavior = new RunningPlay();
    }

    @Override
    public void display() {
        System.out.println("...I'm Huskies dog!...");
    }
   
   
}