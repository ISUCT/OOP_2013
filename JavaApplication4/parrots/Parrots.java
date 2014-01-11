package parrots;

/**
 *
 * @author Дашка1
 */
public abstract class Parrots{
    

    CommunicateBehavior communicateBehavior;
    SizeBehavior sizeBehavior;
    TailSmallBehavior topknotBehavior;
    FlyBehavior flyBehavior;
     
    
    public void performCommunicate(){
       communicateBehavior.communicate();
    }
     public void performSize(){
        sizeBehavior.size();
     }
      public void performTailSmall(){
        TailSmallBehavior.TailSmall();
     }
    
     
    public static void main(String[] args){
        
       
      Talkativepticca parrot1 = new Talkativepticca();
       parrot1.display();
       parrot1.fly();
       parrot1.performCommunicate();
       parrot1.performSize();
       parrot1.performtail();
       
      
       Masha parrot2 = new Masha();
       parrot2.display();
       parrot2.fly();
       parrot2.performCommunicate();
       parrot2.performSize();
       parrot2.performtail();
       
       
       Kesha parrot3= new Kesha();
       parrot3.display();
       parrot3.fly();
       parrot3.performCommunicate();
       parrot3.performSize();
       parrot3.performtail();
       
       
    }
    
    public void fly() {
        System.out.println("Я умею летать.");
}
  
    public abstract void display();
    
     public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }  
    
    public void setCommunicateBehavior (CommunicateBehavior cb){
        communicateBehavior = cb;
    }  
    public void setSizeBehavior (SizeBehavior sb){
        sizeBehavior = sb;
    }
      public void setTopknotBehavior (TailBehavior tb){
        topknotBehavior = tb;
    }
    
}
