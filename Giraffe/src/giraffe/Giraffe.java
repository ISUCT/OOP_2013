/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe;

/**
 *
 * @author Stud_6
 */
public abstract class Giraffe extends MammalAnimal{
    RunBehavior runBehavior;
    Behavior mood;
       
    
    public void performRun(){
        runBehavior.run();
    }
    
    public void performBehavior(){
        mood.behavior();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TypicalGiraffe jim = new TypicalGiraffe();
        jim.display();
        jim.performRun();
        jim.performBehavior();
        jim.setBehavior(new KindGiraffe());
        
//       
        
        NotTypicalGiraffe cim = new NotTypicalGiraffe();
        cim.display();
        cim.performRun();
        cim.performBehavior();
       
    
        
    }
    public abstract void display();
    
     public void setBehavior(Behavior sb){
    	mood = sb;
    }
      public void setRun(Run rb){
    	runBehavior = rb;
    }
 
}
