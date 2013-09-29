/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bear;

/**
 *
 * @author stud_6
 */
public class Panda extends Bear{
public Panda  (){
    roarBehavior = new Roar ();
    sleepBehavior = new Sleep ();
    eatFishBehavior = new NoEatFish ();
    climbTreesBehavior = new CliiimbTrees ();
}
    @Override
    public void display() {
        System.out.println("Я панда");
    }
    
    
}
