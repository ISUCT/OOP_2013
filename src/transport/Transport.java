/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

/**
 *
 * @author Елена
 */
public abstract class Transport {

DriveBehavior driveBehavior;
    SoundBehavior soundBehavior;
    
    public void performDrive(){
        driveBehavior.Drive();
    }
    
    public void performSound(){
        soundBehavior.Sound();
    }
    
    public static void main(String[] args){
       Bicycle transport1 = new Bicycle();
       transport1.display();
       transport1.performDrive();
       transport1.performSound();
       Moped transport2 = new Moped();
       transport2.display();       
       transport2.performDrive();
       transport2.performSound();
       Car transport3= new Car();
       transport3.display();
       transport3.performDrive();
       transport3.performSound();
       
       
    }
    
    public void sound() {
        System.out.println("Bip-Bip-Bip");
}
    public void drive(){
        System.out.println("I am driving!");
    }
    public abstract void display();
    public void setDriveBehavior (DriveBehavior db){
        driveBehavior = db;
    }  
    public void setSoundBehavior (SoundBehavior sb){
        soundBehavior = sb;
    }
    
}