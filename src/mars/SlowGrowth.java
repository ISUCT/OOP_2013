/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMars;

/**
 *
 * @author михаил
 */
public class SlowGrowth implements GrowthBehavior {

    @Override
    public void growth() {
        System.out.println("I am growing very sl-o-o-ow");
    }
}