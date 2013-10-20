/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author stud_6
 */
public class ThirdPartyDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
  public void update (float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
        
    }  
public void display (){
        System.out.println("Вывод другой информации на основании полученных данных");
 
    }

}