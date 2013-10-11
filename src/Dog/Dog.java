/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;

/**
 *
 * @author Alyona
 */
public abstract class Dog {

    
       SleepBehavior sleepBehavior;
       PlayBehavior playBehavior;
       
    public void performSleep(){
        sleepBehavior.Sleep();
    }
    
    public void performPlay(){
        playBehavior.Play();
    }
    
    public static void main(String[] args){
        Huskies dog1 = new Huskies();
        dog1.display();
        dog1.performPlay();
        dog1.play();
        dog1.performSleep();
        dog1.sleep(); 
        
       
       
        Labrador dog2 = new Labrador();
        dog2.display(); 
        dog2.performPlay();
        dog2.play();
        dog2.performSleep();
        dog2.sleep(); 
       
        
        
        BassetHound dog3 = new BassetHound();
        dog3.display();        
        dog3.performPlay();
        dog3.play();
        dog3.performSleep();
        dog3.sleep(); 
        
        
        
    }
    
    public void sleep() {
        System.out.println("I'm sleeping now -zzzz");
}
    public void play(){
        System.out.println("I'm playing now");
    }
    public abstract void display();
        public void  setsleepBehavior(SleepBehavior sb){
            sleepBehavior = sb;
        }
        public void setplayBehavior(PlayBehavior tb){
            playBehavior = tb;
        }
}