
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
         
    public void setFlyBehavior(FlyBehavior fb){
    	flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior fb){
    	quackBehavior = fb;
    }
}