/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

/**
 *
 * @author админ
 */
public abstract class Ducks {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    /**
     * @param args the command line arguments
     */
//    public void quack () {
//        System.out.println("Кря-кря-кря!");
//    }
    
    public void setFlyBehavior (FlyBehavior typeOfFlyght){
        this.flyBehavior = typeOfFlyght;
    }
    
    public void setQuackBehavior (QuackBehavior typeOfQuack){
        this.quackBehavior = typeOfQuack;
    } 
    public void performFly () {
        flyBehavior.fly();
    }
    public void performQuack () {
        quackBehavior.makeSound();
    } 
    public abstract void display();    
        // TODO code application logic here
    public void swim () {
        System.out.println("Буль-буль!");
    }
    public static void main (String [] args){
        
        MallardDuck duckM1 = new MallardDuck ();
        RedHeadDuck duckRH1 = new RedHeadDuck ();
        RubberDuck duckR1 = new RubberDuck ();
        
        duckM1.display();
        duckRH1.display ();
        duckR1.display();
        
        duckM1.setFlyBehavior(new FlyWithWings()) ;
        duckM1.performFly ();
        duckRH1.setFlyBehavior(new FlyWithWings());
        duckRH1.performFly();
        duckR1.setFlyBehavior(new FlyNoWay ());
        duckR1.performFly();
        duckR1.setFlyBehavior(new FlyByRocket ());
        duckR1.performFly();
        
        duckM1.setQuackBehavior(new Quack ());
        duckM1.performQuack();
        duckRH1.setQuackBehavior(new Quack ());
        duckRH1.performQuack();
        duckR1.setQuackBehavior(new Squeak ());
        duckR1.performQuack(); 
        
        duckM1.swim();
        duckRH1.swim();
        duckR1.swim();
        
        
    }
    
}
