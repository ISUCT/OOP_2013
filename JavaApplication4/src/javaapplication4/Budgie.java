/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class Budgie extends Birds {
    
    public Budgie() {
    flyBehavior = new FlyWithWings();
    soundBehavior = new Sing();
    birdBehavior = new AngryBird();
    sleepBehavior = new SleepAtNight();
    }    
    @Override
    public String display(){
        System.out.println("Я маленький волнистый попугайчик");
        return "Я маленький волнистый попугайчик";
        
    }
}
