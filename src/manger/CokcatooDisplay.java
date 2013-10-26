
package manger;

/**
 * @author Бессонова Татьяна
 */

public class CokcatooDisplay implements Observer,MacawDisplay {
    
 private String fullmanger;
 private String emptymanger;
    
public void update (String fullmanger, String emptymanger){
   this.fullmanger = fullmanger;
   this.emptymanger = emptymanger;
        display();
        
    }
public void display (){
        System.out.println("Вывод информации о состоянии кормушки");
 
    }


}  