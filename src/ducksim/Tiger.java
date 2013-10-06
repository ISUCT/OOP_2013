package ducksim;

public abstract class Tiger {
    
    GrowlBehavior growlBehavior;
    RunBehavior runBehavior;
    EatBehavior eatBehavior;
    
    public void performGrowl(){
        growlBehavior.growl();
    }
    
    public void performRun(){
        runBehavior.Run();
    }
     public void performEat(){
        eatBehavior.eat();
     }
    
    public static void main(String[] args){
       BelgianTiger tiger1 = new BelgianTiger();
       tiger1.display();
       tiger1.growl();
       tiger1.run();
       tiger1.performGrowl();
       tiger1.performRun();
       WhiteTiger tiger2 = new WhiteTiger();
       tiger2.display();
       tiger2.swim();
       tiger2.quack();        
       tiger2.performFly();
       tiger2.performQuack();
       
       
    }
    
    public void growl() {
        System.out.println("Я рычу!");
}
    public void run(){
        System.out.println("Я бегу!");
    }
     public void eat(){
        System.out.println("Я ем!");
     }
     
    public abstract void display();
    
    public void setFlyBehavior (GrowlBehavior fb){
        growlBehavior = fb;
    }  
    public void setQuackBehavior (RunBehavior qb){
        runBehavior = qb;
    }
      public void setSqueakBehavior (EatBehavior sb){
        eatBehavior = sb;
    }
    
}

 