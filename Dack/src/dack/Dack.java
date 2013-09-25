package dack;

public abstract class Dack {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SqueakBehavior squeakBehavior;
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.Quack();
    }
     public void performSqueak(){
        squeakBehavior.squeak();
     }
    
    public static void main(String[] args){
       MallardDack dack1 = new MallardDack();
       dack1.display();
       dack1.swim();
       dack1.quack();
       dack1.performFly();
       dack1.performQuack();
       RedheadDack dack2 = new RedheadDack();
       dack2.display();
       dack2.swim();
       dack2.quack();        
       dack2.performFly();
       dack2.performQuack();
       RubberDack dack3= new RubberDack();
       dack3.display();
       dack3.swim();
       dack3.squeak();
       dack3.performFly();
       dack3.performSqueak();
       
       
    }
    
    public void quack() {
        System.out.println("Я крякаю!");
}
    public void swim(){
        System.out.println("Я плаваю!");
    }
     public void squeak(){
        System.out.println("Я пищу!");
     }
     
    public abstract void display();
    
    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }  
    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior = qb;
    }
      public void setSqueakBehavior (SqueakBehavior sb){
        squeakBehavior = sb;
    }
    
}

 