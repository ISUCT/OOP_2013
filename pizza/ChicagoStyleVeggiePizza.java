/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public class ChicagoStyleVeggiePizza  extends Pizza {
 public  ChicagoStyleVeggiePizza(){
     name="Chicago Style Deep Dish Veggie Pizza";
     dough="Extra Thick Crust Dough";
     sause="Plum Tomato Sause";
     toppings.add("Shredded Mozzarella Veggie");
 }
 void cut(){
     System.out.println("Cutting the pizza into square slices");
 }
}
