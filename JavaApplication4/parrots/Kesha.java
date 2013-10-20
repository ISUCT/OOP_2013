package parrots;
/**
 *
 * @author Дашка1
 */

    public class Kesha   extends Parrots {
    
    public Kesha () { 
        
    flyBehavior = new Fly();
         
    communicateBehavior = new NoCommunicate();

    sizeBehavior = new LessSize();
    
     tailBehavior  = new  BigTail();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Привет, Я попугай  Кеша");
    }
}
    
