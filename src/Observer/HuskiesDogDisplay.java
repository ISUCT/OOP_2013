/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Alyona
 */
public class HuskiesDogDisplay implements Observer,DisplayElement{
    private String brakfast;
    private String spring;
    private String summer;
    
  public void update (String winter, String spring, String summer){
        this.brakfast = brakfast;
        this.spring = spring;
        this.summer = summer;
       
        display();
        
    }  
public void display (){
        System.out.println("Вывод");
 
    }


}  