/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;

/**
 *
 * @author Admin
 */
public class BearDisplay implements Observer,DisplayElement {
    private String winter;
    private String spring;
    private String summer;
    private String autumn;
    private Subject Seasons;
    
     public BearDisplay (Subject Seasons){
        this.Seasons = Seasons;
        Seasons.registerObserver(this);
        
    }
     public void update (String winter, String spring, String summer, String autumn){
        this.winter = winter;
        this.spring = spring;
        this.summer = summer;
        this.autumn = autumn;
        display();
        
    }

   
    public void display() {
        System.out.println("Ты - медведь, когда наступит зима тебе" + winter + " Придет весна тебе " + spring  + " Наступит лето тебе пора " + summer  + " А когда наступит осень, тогда" + autumn);
    
       
    }
}
