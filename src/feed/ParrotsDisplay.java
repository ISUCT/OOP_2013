
package feed;
/**
 * @author Бессонова Татьяна
 */

public class ParrotsDisplay implements Observer,MacawDisplay {
    
private float  morning;
private float afternoon;
private float evening;
private Subject Feed;


public  ParrotsDisplay (Subject Food){
        this.Feed = Feed ;
        Food.registerObserver(this);
        
    }
public void update (float morning, float afternoon, float evening){
   this. morning =  morning;
   this.afternoon = afternoon;
   this.evening = evening;
        display();
        
    }
 public void display() {
        System.out.println("Мы тебя покормим в :"  +  morning  +  " - это будет считать твоим завтраком,а в :"  +   afternoon   +   "- считатется обедом,а  последний приём пищи будет в :"   +   evening );
    }
    
}
    

