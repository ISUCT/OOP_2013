/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

/**
 *
 * @author stud_6
 */
public class FlyWithWings implements FlyBehavior {
    @Override 
       public void fly () {
        System.out.println ("Я летаю с помощью крыльев!");
    }
}