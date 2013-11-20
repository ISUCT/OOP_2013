/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

/**
 *
 * @author stud_6
 */


    /**
     * @param args the command line arguments
     */
   
public abstract class Utka {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.Quack();
    }
    
    public static void main(String[] args){
        MallardDuck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.quack();
        duck1.swim();
        duck1.performQuack();
        RedheadDuck duck2 = new RedheadDuck();
        duck2.swim();
        duck2.quack();
        duck2.display(); 
        duck2.performFly();
        duck2.performQuack();
    }
    
    public void quack() {
        System.out.println("Quack-Quack");
}
    public void swim(){
        System.out.println("I swim!");
    }
    public abstract void display();
}