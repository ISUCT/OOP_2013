/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMars;

public class PredatorSell extends Mars{
   public PredatorSell(){
    eatBehavior= new EatMeat();
    growthBehavior= new FastGrowth();
    moveBehavior= new Move();
   }
public String disply(){
    System.out.println("i`m a predator!!");
return  "i`m a predator!!";
}
}


