/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author stud_6
 */

public class Penguin extends Birds {
    
    public Penguin() {
    flyBehavior = new FlyNoWay();
    soundBehavior = new MuteSound();
    birdBehavior = new CuteBird();
    sleepBehavior = new SleepAtNight();
    }    
    @Override
    public String display(){
        System.out.println("я - большой пингвин");
        return "я - большой пингвин";
        
    }
}
