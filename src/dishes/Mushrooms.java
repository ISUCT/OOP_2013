/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Mushrooms extends Ingridients{
    Dish dish; 
    public Mushrooms(Dish dish){
      this.dish = dish; 
    } 
    public String getDescription() {
      return dish.getDescription() + ",грибы"; 
    }
    @Override
    public double cost() { 
      return .27 + dish.cost ();
    }
}
