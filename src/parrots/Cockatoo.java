
package parrots;

 public class Cockatoo   extends Parrots {
    
    public Cockatoo () { 
        
    flyBehavior = new Fly();
         
    communicateBehavior = new NoCommunicate();

    sizeBehavior = new LessSize();
    
     topknotBehavior  = new  Topknot();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Здравствуйте, Я попугай  КАКАДУ");
    }
}
    
    
    