/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

/**
 *
 * @author админ
 */
public class FlyByRocket implements FlyBehavior{
    @Override 
       public void fly () {
        System.out.println ("Я летаю на ракете!");
    }
}