/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bear;

/**
 *
 * @author Admin
 */
public class NoEatFish implements EatFishBehavior {

    @Override
    public void EatFish() {
         System.out.println("Я не ем рыбу");
    }
    
    
}
