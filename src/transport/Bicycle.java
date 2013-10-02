/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author Елена
 */

public class Bicycle extends Transport{
    public Bicycle() {
    driveBehavior = (DriveBehavior) new Drivewithpedals();

    soundBehavior = (SoundBehavior) new NoSignal();
    
    }    
@Override
    public void display() {
      System.out.println("It Is Bicycle");

}
}