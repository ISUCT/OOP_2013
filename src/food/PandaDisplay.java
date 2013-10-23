/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author Admin
 */
public class PandaDisplay implements Observer,BrownBearDisplay {
private float breakfast;
private float lunch;
private float dinner;
public void update (float breakfast, float lunch, float dinner){
   this.breakfast = breakfast;
   this.lunch = lunch;
   this.dinner = dinner;
        display();
        
    }
public void display (){
        System.out.println("Вывод");
 
    }


}  
   
