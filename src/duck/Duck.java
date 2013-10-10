
package duck;


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
       
        RedHeadDuck duck2 = new RedHeadDuck();
        duck2.swim();
        duck2.quack();
        duck2.display(); 
        duck2.performFly();
        duck2.performQuack();
        
        RubberDuck duck3 = new RubberDuck();
        duck3.swim();
        duck3.quack();
        duck3.setFlyBehavior(new FlyNoWay());
        duck3.display(); 
        duck3.performFly();
        duck3.performQuack();
        
    }
    
    public void quack() {
        System.out.println("Кряк !!!");
}
    public void swim(){
        System.out.println("Я плаваю!");
    }
    public abstract void display();
        public void  setFlyBehavior(FlyBehavior fb){
            flyBehavior = fb;
        }
        public void setQuackBehavior(QuackBehavior qb){
            quackBehavior = qb;
        }
}