package parrots;
/**
 *
 * @author Дашка1
 */
 public class Masha  extends Parrots {
    
    public Masha() {
        
     flyBehavior = new Fly();
        
     communicateBehavior = new Communicate();

     sizeBehavior = new Size();
    
     tailBehavior  = new  SmallTail();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Привет,Я попугай Маша");
    }
}