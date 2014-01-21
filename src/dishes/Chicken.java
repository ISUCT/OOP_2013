/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Chicken extends Ingridients{
     Dish dish; 
    public Chicken(Dish dish){
      this.dish = dish; 
    } 
    public String getDescription() {
      return dish.getDescription() + ",курица"; 
    }
    @Override
    public double cost() { 
      return .30 + dish.cost ();
    } 
}
