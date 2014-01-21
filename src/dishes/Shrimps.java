/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Shrimps extends Ingridients{
   Dish dish; 
    public Shrimps(Dish dish){
      this.dish = dish; 
    } 
    public String getDescription() {
      return dish.getDescription() + ",креветки"; 
    }
    @Override
    public double cost() { 
      return .23 + dish.cost ();
    }
}
