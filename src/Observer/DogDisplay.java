/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Alyona
 */
public class DogDisplay implements Observer,DisplayElement {
    private String breakfast;
    private String dinner;
    private String supper;
    
    private Subject Eating;
    
     public DogDisplay (Subject Eating){
        this.Eating = Eating;
        Eating.registerObserver(this);
        
    }
     public void update (String breakfast, String dinner, String supper){
        this.breakfast = breakfast;
        this.dinner = dinner;
        this.supper = supper;
        
        display();
        
    }

   
    public void display() {
        System.out.println("Ты - собака! Тебе нужно правильно питаться. Когда наступит завтрак, ты будешь есть" + breakfast + " Наступит обед, ты будешь есть " + dinner  + " Наступит ужин, ты будешь есть " + supper );
    
       
    }
}