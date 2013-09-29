/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bear;

/**
 *
 * @author stud_6
 */
public abstract class Bear {
    RoarBehavior roarBehavior ;
    SleepBehavior sleepBehavior;
    EatFishBehavior eatFishBehavior;
    ClimbTreesBehavior climbTreesBehavior;
    
    public void performRoar(){
        roarBehavior.Roar();
    }
     public void performSleep(){
        sleepBehavior.Sleep();
    }
  
     public void performEatFish(){
     eatFishBehavior.EatFish();
     }
     public void performClimbTrees(){
     climbTreesBehavior.ClimbTrees();
     }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BrownBear bear1 = new BrownBear ();
        bear1.display();
        bear1.roar ();
        bear1.sleep ();
        bear1.performEatFish ();
        bear1.performClimbTrees ();
        
        PolarBear bear2 = new PolarBear ();
        bear2.display();
        bear2.roar ();
        bear2.sleep ();
        bear2.performEatFish ();
        bear2.performClimbTrees ();
        
        Panda bear3 = new Panda ();
        bear3.display();
        bear3.roar ();
        bear3.sleep ();
        bear3.performEatFish ();
        bear3.performClimbTrees ();
         
    }
    
    public void roar() {
        System.out.println("Я рычуууу!!!");
    }
    
    public void sleep() {
        System.out.println("Я сплю!!!");
       
    }
       public abstract void display();
       
          public void setRoarBehavior (RoarBehavior rb){
        roarBehavior=rb;
          }
           public void setSleepBehavior (SleepBehavior sb){
        sleepBehavior=sb;
          }
 
          public void setEatFishBehavior (EatFishBehavior efb){
      eatFishBehavior=efb;
       }
          public void setClimbTreesBehavior (ClimbTreesBehavior ctb){
      climbTreesBehavior=ctb;
       }
            
          
       
   
    
}
