/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMars;

public class HerbivorousCell extends Mars {

    public HerbivorousCell() {
        eatBehavior = new EatPlant();
        growthBehavior = new FastGrowth();
        moveBehavior = new Move();

    }

    public String disply() {
        System.out.println("Yes, i`m a vegetarian");
        return "Yes, i`m a vegetarian";
    }
}
    
