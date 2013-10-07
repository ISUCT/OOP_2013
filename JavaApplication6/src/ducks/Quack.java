/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

/**
 *
 * @author админ
 */
public class Quack implements QuackBehavior{
    @Override 
       public void makeSound () {
        System.out.println ("Я умею крякать!");
    }
}