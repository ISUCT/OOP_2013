
package parrots;

public abstract class Parrots{
    

    CommunicateBehavior communicateBehavior;
    SizeBehavior sizeBehavior;
    TopknotBehavior topknotBehavior;
    FlyBehavior flyBehavior;
     
    
    public void performCommunicate(){
       communicateBehavior.communicate();
    }
     public void performSize(){
        sizeBehavior.size();
     }
      public void performTopknot(){
        topknotBehavior.topknot();
     }
    
     
    public static void main(String[] args){
        
       //самый маленький попугай Дятловый попугай
       Micropsitta parrot1 = new Micropsitta();
       parrot1.display();
       parrot1.fly();
       parrot1.performCommunicate();
       parrot1.performSize();
       parrot1.performTopknot();
       
       // Ара
       Macaw parrot2 = new Macaw();
       parrot2.display();
       parrot2.fly();
       parrot2.performCommunicate();
       parrot2.performSize();
       parrot2.performTopknot();
       
       //Какаду
       Cockatoo parrot3= new Cockatoo();
       parrot3.display();
       parrot3.fly();
       parrot3.performCommunicate();
       parrot3.performSize();
       parrot3.performTopknot();
       
       
    }
    
    public void fly() {
        System.out.println("Я умею летать!!!!!");
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
      public void setTopknotBehavior (TopknotBehavior tb){
        topknotBehavior = tb;
    }
    
}

 