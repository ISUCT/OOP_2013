/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author stud_6
 */

public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.Quack();
    }
    
    public static void main(String[] args){
        MallarDuck duck1 = new MallarDuck();
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
        Rubberduck duck3 = new Rubberduck();
        duck3 = new Rubberduck();
        duck3.display();
        duck3.performFly();
        duck3.quack();
        duck3.swim();
        duck3.performQuack();
    }
    
    public void quack() {
        System.out.println("кря кря");
}
    public void swim(){
        System.out.println("Я плыву!");
    }
    public abstract void display();
         
    /**
     *
     * @param fb
     */
    public void setFlyBehavior (FlyBehavior flyBehavior) {
     flyBehavior = new FlyBehavior () {

            @Override
            public void fly() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };  
}
}