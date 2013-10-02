/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author Елена
 */
public class Car extends Transport{

    public Car() {
    driveBehavior = (DriveBehavior) new Drivewithmotors();

    soundBehavior = new Signal();
    
    }    

    @Override
    public void display() {
      System.out.println("It is Car");
    }
    
}