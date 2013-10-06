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
    
public class ReadheadDuck extends Tiger {
   public ReadheadDuck(){
       growlBehavior = new Growlwith();
       runBehavior = new Run();
   }
    @Override
    public void display(){
        System.out.println("Я белый тигр");
    }
}
}