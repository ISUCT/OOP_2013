/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svetofor;

/**
 *
 * @author Юлия
 */
public class MopedDisplay implements Observer,PassengerCarDisplay{
private float green;
private float yellow;
private float red;
public void update (float green, float yellow, float red){
   this.green = green;
   this.yellow = yellow;
   this.red = red;
        display();
        
    }
public void display (){
        System.out.println("Вывод");
 
    }


}  
  