
package manger;

/**
 * @author Бессонова Татьяна
 */

public class ParrotsDisplay implements Observer,MacawDisplay {
    
    private String fullmanger;
    private String emptymanger;
       
    private Subject Manger;
    
     public ParrotsDisplay (Subject Seasons){
        this.Manger = Manger;
        Seasons.registerObserver(this);
        
    }
     public void update (String fullmanger, String emptymanger){
         
        this.fullmanger = fullmanger;
        this.emptymanger = emptymanger;
       
        
        display();
        
    }

   
    public void display() {
        System.out.println(" Кормушка  - " + fullmanger + " Ты уверен ??? " + emptymanger );
    }
    
}
