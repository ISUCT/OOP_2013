/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import Observers.bird.Observer;

public class Budgie extends Birds implements Observer {
    
    public Budgie() {
    
    flyBehavior = new FlyWithWings();
    soundBehavior = new Sing();
    birdBehavior = new AngryBird();
   } 
    
     
    @Override
    public String display(){
        System.out.println("Я маленький волнистый попугайчик");
        return "Я маленький волнистый попугайчик";
    }

  
    @Override
    public void update(boolean fullness, String weather) {
        if (fullness == true){
            setBirdBehavior(new CuteBird());
            System.out.println("Я сытый! нямням");
        }else{
            setBirdBehavior(new AngryBird());
            System.out.println("Я голодный волнистый попугайчик, поэтому я очень зол!");
    }
        if (weather.equals(Constants.SUNNY)){
            soundBehavior.Sound();
            System.out.println("Хорошая погодка! Чирик-Чирик!");
        }else{
            setFlyBehavior(new FlyNoWay());
            System.out.println("Погода не летная что-то");
        }
    }
}
