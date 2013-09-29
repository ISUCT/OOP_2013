/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosim;

/**
 *
 * @author Alexander
 */
public abstract class Zoosim {
 RunBehavior runBehavior; 
 AnimalBehavior AnimalBehavior;
    
    public void performRun(){
        runBehavior.Run();
    }
    
    public void performAnimal(){
        AnimalBehavior.Animal();
    }
    
    public static void main(String[] args){
       Tiger zoo1 = new Tiger();
       zoo1.display();
       zoo1.performRun();
       zoo1.performAnimal();
       Zeebra zoo2 = new Zeebra();
       zoo2.display();
       zoo2.performAnimal();
       Elephant zoo3= new Elephant();
       zoo3.display();
       zoo3.performRun();
       zoo3.performAnimal();
       Giraffe zoo4= new Giraffe();
       zoo4.display();
       zoo4.performRun();
       zoo4.performAnimal();
       
       
    }
    
    public void animal() {
        System.out.println("animal");
}
    public void run(){
        System.out.println("run!");
    }
    public abstract void display();
    public void setRunBehavior (RunBehavior rb){
        runBehavior = rb;
    }  
    public void setAnimalBehavior (AnimalBehavior ab){
        AnimalBehavior = ab;
    }
    
}
