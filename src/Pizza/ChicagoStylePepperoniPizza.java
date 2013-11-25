/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizza;

/**
 *
 * @author nastyalobanova
 */
public class ChicagoStylePepperoniPizza  extends Pizza {
 public  ChicagoStylePepperoniPizza(){
     name="Chicago Style Deep Dish Pepperoni Pizza";
     dough="Extra Thick Crust Dough";
     sause="Plum Tomato Sause";
     toppings.add("Shredded Mozzarella Pepperoni");
 }
 void cut(){
     System.out.println("Cutting the pizza into square slices");
 }
}
