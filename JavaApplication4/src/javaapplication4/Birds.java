package javaapplication4;

import Observers.bird.Observer;
import decorator.Additions;
import decorator.Cell;

public abstract class Birds extends Additions implements Observer  {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    BirdBehavior birdBehavior;
    private boolean fullness;
    private String Weather;

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
     
        Birds Kesha = new Budgie();
        Kesha = new Cell(Kesha);
        Kesha.display();
        Kesha.performFly();
        Kesha.performSound();
        Kesha.performBehavior();
        Kesha.setBirdBehavior(new CuteBird());
        Kesha.performBehavior();
        Kesha.setSoundBehavior(new Talk());
        Kesha.performSound();
        Kesha.update(true, Constants.SUNNY);
        System.out.println(Kesha.getDescription());
         
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
