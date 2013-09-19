/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author stud_6
 */
public abstract class Duck {
FlyBehavior flyBehavior;    
    
public void setFlyBehavior(FlyBehavior fB){
    flyBehavior = fB;
}

public void performFly(){
    flyBehavior.fly();
}

public abstract void display();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MallardDuck duck1 = new MallardDuck();
        duck1.display();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.performFly();
        duck1.setFlyBehavior(new FlyNoWay());
        duck1.performFly();
        
        ReadHeadDuck duck2 = new ReadHeadDuck();
        duck2.display();
        
        
    }
}
