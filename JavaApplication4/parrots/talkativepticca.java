package parrots;
/**
 *
 * @author Дашка1
 */
public class talkativepticca extends Parrots {
    
    public talkativepticca() {
        
    flyBehavior = new Fly();
    
    communicateBehavior = new LotCommunicate();

    sizeBehavior = new LessSize();
    
    tailBehavior  = new  SmallTail();
    }    
    
    @Override
    public void display(){
        System.out.println("Привет,Я самый разговорчивый попугай ");
    }
}
