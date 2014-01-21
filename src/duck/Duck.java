package duck;

public abstract class Duck {
FlyBehavior flyBehavior;    
QuackBehavior quackBehavior; 

public void performFly(){
    flyBehavior.fly();
}

public void performQuack(){
    quackBehavior.quack();
}

public void swim(){
    System.out.println("All ducks float!");
}
public abstract void display();
    
    public static void main(String[] args) {
        
        MallardDuck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        
        RedHeadDuck duck2 = new RedHeadDuck();
        duck2.display();
        duck2.performFly();
        duck2.performQuack();

        
        RubberDuck duck3 = new RubberDuck();
        duck3.display();
        duck3.performFly();
        duck3.performQuack();
        
        duck3.swim();
    }
}
