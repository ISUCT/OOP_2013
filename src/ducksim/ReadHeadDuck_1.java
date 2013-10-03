/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author Аня
 */
class ReadHeadDuck {
    
public class ReadheadDuck extends Duck {
   public ReadheadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public void display(){
        System.out.println("Я красноголовая уточка");
    }
}
}