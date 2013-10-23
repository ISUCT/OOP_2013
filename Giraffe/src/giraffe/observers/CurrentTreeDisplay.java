/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe.observers;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Stud_6
 */
public class CurrentTreeDisplay implements Observer, DisplayElement{
    Observable observable;
    private float height;
    private float distance;
    private boolean fruits;
    
  public CurrentTreeDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof TreeData){
            TreeData treeData = (TreeData)obs;
            this.height = treeData.getHeight();
            this.distance = treeData.getDistance();
            this.fruits = treeData.getFruits();          
            display();
        }
    }

    @Override
    public void display() {
        if(fruits == true){
            System.out.println("Прием! Поблизости находится дерево, высотой " + height + " метров, до него шагать " + distance + " метров. Есть вкусненькие фрукты! Налетай!" );
        }else{
            System.out.println("Прием! Поблизости находится дерево, высотой " + height + " метров, до него шагать " + distance + " метров. На нем нет вкусненьких фруктов! Отбой :(" );
        }
        
    }
}
