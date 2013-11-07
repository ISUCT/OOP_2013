/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacecar;

/**
 *
 * @author Юлия
 */
public class PaceCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Automobile automobile = new Car(); 
        System.out.println(automobile.getDescription() 
        + "$" + automobile.cost () ) ; 

        Automobile automobile2 = new SecondCar ();
        automobile2 = new FrameMachine (automobile2);
        automobile2 = new Rudder (automobile2);
        automobile2 = new Glass (automobile2);
        automobile2 = new Stereo (automobile2);
        automobile2 = new Wheel (automobile2);
        System.out.println(automobile2.getDescription() 
        + "$" + automobile2.cost () ) ; 
        
      }
}