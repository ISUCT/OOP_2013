/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMars;

public class EatPlant implements EatBehavior {

    @Override
    public void eat() {
        System.out.println("I can eat plants only!");
    }
}
