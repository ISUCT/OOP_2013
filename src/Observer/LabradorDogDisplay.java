/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Alyona
 */
public class LabradorDogDisplay implements Observer,DisplayElement{
    private String brakfast;
    private String dinner;
    private String supper;
   
  public void update (String breakfast, String dinner, String supper){
        this.brakfast = brakfast;
        this.dinner = dinner;
        this.supper = supper;
        
        display();
        
    }  
public void display (){
        System.out.println("Вывод");
 
    }


}  
