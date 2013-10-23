
package feed;

/**
 * @author Бессонова Татьяна
 */

public class CokcatooDisplay implements Observer,MacawDisplay {
    
private float morning;
private float afternoon;
private float evening;
public void update (float breakfast, float afternoon, float evening){
   this.morning = breakfast;
   this.afternoon = afternoon;
   this.evening = evening;
        display();
        
    }
public void display (){
        System.out.println("Вывод информации о кормлении");
 
    }


}  