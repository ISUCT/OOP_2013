/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Тимоша
 */
public class RedHeadDuck extends Duck {
   public RedHeadDuck(){
       flyBehavior = new FlyWithWings();
       quackBehavior = new Quack();
   }
    @Override
    public void display(){
        System.out.println("У меня красный окрас головы");
    }

  
}

