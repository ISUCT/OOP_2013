/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMars;

public class Plant extends Mars {

    public Plant() {
        eatBehavior = new EatCO2();
        growthBehavior = new SlowGrowth();
        moveBehavior = new NoMove();
    }

    public String disply() {
        System.out.println("i`m just a plant!");
        return "i`m just a plant!";
    }
}