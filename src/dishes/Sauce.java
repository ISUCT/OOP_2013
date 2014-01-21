/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Sauce extends Ingridients{
   Dish dish; 
    public Sauce(Dish dish){
      this.dish = dish; 
    } 
    public String getDescription() {
      return dish.getDescription() + ",соус"; 
    }
    @Override
    public double cost() { 
      return .10 + dish.cost ();
    } 
}
