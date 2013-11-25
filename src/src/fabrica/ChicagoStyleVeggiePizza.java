/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Юлия
 */
public class ChicagoStyleVeggiePizza  extends Pizza {
 public  ChicagoStyleVeggiePizza(){
     name="Chicago Style Deep Dish Veggie Pizza";
     dough="Extra Thick Crust Dough";
     sauce="Plum Tomato Sauce";
     toppings.add("Shredded Mozzarella Veggie");
 }
 void cut(){
     System.out.println("Cutting the pizza into square slices");
 }
}