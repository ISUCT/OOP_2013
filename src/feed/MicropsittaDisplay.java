
package feed;

/**
 * @author Бессонова Татьяна
 */
public class MicropsittaDisplay implements Observer,MacawDisplay {
    
private float morning;
private float afternoon;
private float evening;
public void update (float morning, float afternoon, float evening){
   this.morning = morning;
   this.afternoon = afternoon;
   this.evening = evening;
        display();
        
    }
public void display (){
        System.out.println("Вывод информации о кормлении");
 
    }


}    