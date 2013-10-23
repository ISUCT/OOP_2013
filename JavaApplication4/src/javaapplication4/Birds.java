package javaapplication4;

import Observers.bird.Observer;
import java.util.Observable;

public abstract class Birds implements Observer {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    BirdBehavior birdBehavior;
    private boolean fullness;
 //  private String Weather;

    
    

    
    public void performFly(){
        flyBehavior.fly();
    }
   
    public void performSound(){
        soundBehavior.Sound();
    }
    public void performBehavior(){
        birdBehavior.Behavior();
    }
   
    
    public static void main(String[] args){
        Budgie Kesha = new Budgie();
        Kesha.display();
        Kesha.performFly();
        Kesha.performSound();
        Kesha.performBehavior();
        Kesha.setBirdBehavior(new CuteBird());
        Kesha.performBehavior();
        Kesha.setSoundBehavior(new Talk());
        Kesha.performSound();
        Kesha.update(true, Constants.SUNNY);
        Canary Jora = new Canary();
        Jora.display();
        Jora.update(false, Constants.RAINY);
        Jora.performSound();
        Jora.performFly();
        Jora.performBehavior();
        
    }
    public void sound() {
        System.out.println("Чирик-чирик");
}
   
    
    public abstract String display();
    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }  
    public void setSoundBehavior (SoundBehavior sb){
        soundBehavior = sb;
    }
  
    public void setBirdBehavior (BirdBehavior bb){
        birdBehavior = bb;
    }
    
   
}
