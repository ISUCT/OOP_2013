/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import Observers.bird.Observer;



public class Canary extends Birds implements Observer{
    
    public Canary() {
    flyBehavior = new FlyNoWay();
    soundBehavior = new MuteSound();
    birdBehavior = new CuteBird();
    
    }
    
    @Override
    public String display(){
        System.out.println("я - маленькая канарейка");
        return "я - маленькая канарейка";
        
    }

   
    @Override
    public void update(boolean fullness, String weather) {
        
        if (fullness == true){
            setBirdBehavior(new CuteBird());
            System.out.println("Я сытый! нямням");
        }else{
            setBirdBehavior(new AngryBird());
            System.out.println("Я голодная и злая канарейка!");
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