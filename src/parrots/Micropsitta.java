
package parrots;

public class Micropsitta extends Parrots {
    
    public Micropsitta() {
        
    flyBehavior = new Fly();
    
    communicateBehavior = new NoCommunicate();

    sizeBehavior = new LessSize();
    
    topknotBehavior = new  NoTopknot();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Здравствуйте, Я самый маленький в мире попугайчик - дятловый ");
    }
}
    
    
    