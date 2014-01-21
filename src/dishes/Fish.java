/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Fish extends Ingridients{
    Dish dish; 
    public Fish(Dish dish){
      this.dish = dish; 
    } 
    public String getDescription() {
      return dish.getDescription() + ",рыба"; 
    }
    @Override
    public double cost() { 
      return .38 + dish.cost ();
    }
}
