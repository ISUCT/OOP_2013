/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bear;

/**
 *
 * @author stud_6
 */
public class PolarBear extends Bear{
    public PolarBear (){
          roarBehavior = new Roar ();
          sleepBehavior = new Sleep ();
          eatFishBehavior = new EeeeatFish ();
          climbTreesBehavior = new NoClimbTrees ();
      }

    @Override
    public void display() {
        System.out.println("Я полярный медвежонок");
    }
    
}
