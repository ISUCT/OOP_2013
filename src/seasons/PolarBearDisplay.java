/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;

/**
 *
 * @author home
 */
public class PolarBearDisplay implements Observer,DisplayElement{
    private String winter;
    private String spring;
    private String summer;
    private String autumn;
  public void update (String winter, String spring, String summer, String autumn){
        this.winter = winter;
        this.spring = spring;
        this.summer = summer;
        this.autumn = autumn;
        display();
        
    }  
public void display (){
        System.out.println("Вывод");
 
    }


}  